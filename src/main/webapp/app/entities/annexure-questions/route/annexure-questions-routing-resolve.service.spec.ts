jest.mock("@angular/router");

import { TestBed } from "@angular/core/testing";
import { HttpResponse } from "@angular/common/http";
import { HttpClientTestingModule } from "@angular/common/http/testing";
import { ActivatedRouteSnapshot, Router } from "@angular/router";
import { of } from "rxjs";

import {
  IAnnexureQuestions,
  AnnexureQuestions,
} from "../annexure-questions.model";
import { AnnexureQuestionsService } from "../service/annexure-questions.service";

import { AnnexureQuestionsRoutingResolveService } from "./annexure-questions-routing-resolve.service";

describe("Service Tests", () => {
  describe("AnnexureQuestions routing resolve service", () => {
    let mockRouter: Router;
    let mockActivatedRouteSnapshot: ActivatedRouteSnapshot;
    let routingResolveService: AnnexureQuestionsRoutingResolveService;
    let service: AnnexureQuestionsService;
    let resultAnnexureQuestions: IAnnexureQuestions | undefined;

    beforeEach(() => {
      TestBed.configureTestingModule({
        imports: [HttpClientTestingModule],
        providers: [Router, ActivatedRouteSnapshot],
      });
      mockRouter = TestBed.inject(Router);
      mockActivatedRouteSnapshot = TestBed.inject(ActivatedRouteSnapshot);
      routingResolveService = TestBed.inject(
        AnnexureQuestionsRoutingResolveService
      );
      service = TestBed.inject(AnnexureQuestionsService);
      resultAnnexureQuestions = undefined;
    });

    describe("resolve", () => {
      it("should return IAnnexureQuestions returned by find", () => {
        // GIVEN
        service.find = jest.fn((id) => of(new HttpResponse({ body: { id } })));
        mockActivatedRouteSnapshot.params = { id: 123 };

        // WHEN
        routingResolveService
          .resolve(mockActivatedRouteSnapshot)
          .subscribe((result) => {
            resultAnnexureQuestions = result;
          });

        // THEN
        expect(service.find).toBeCalledWith(123);
        expect(resultAnnexureQuestions).toEqual({ id: 123 });
      });

      it("should return new IAnnexureQuestions if id is not provided", () => {
        // GIVEN
        service.find = jest.fn();
        mockActivatedRouteSnapshot.params = {};

        // WHEN
        routingResolveService
          .resolve(mockActivatedRouteSnapshot)
          .subscribe((result) => {
            resultAnnexureQuestions = result;
          });

        // THEN
        expect(service.find).not.toBeCalled();
        expect(resultAnnexureQuestions).toEqual(new AnnexureQuestions());
      });

      it("should route to 404 page if data not found in server", () => {
        // GIVEN
        jest
          .spyOn(service, "find")
          .mockReturnValue(
            of(new HttpResponse({ body: null as unknown as AnnexureQuestions }))
          );
        mockActivatedRouteSnapshot.params = { id: 123 };

        // WHEN
        routingResolveService
          .resolve(mockActivatedRouteSnapshot)
          .subscribe((result) => {
            resultAnnexureQuestions = result;
          });

        // THEN
        expect(service.find).toBeCalledWith(123);
        expect(resultAnnexureQuestions).toEqual(undefined);
        expect(mockRouter.navigate).toHaveBeenCalledWith(["404"]);
      });
    });
  });
});
