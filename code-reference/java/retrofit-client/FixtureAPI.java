package org.gex.client.v1;
import retrofit.http.*;
import retrofit.client.Response;
import java.util.List;
import java.util.Map;

import rx.Observable;
import retrofit.mime.TypedFile;
import com.pojos.v1.*;


public interface FixtureAPI {

  @GET("/v1/cats")
  Observable<List> getGatitosAndSearchBy(
      @Query("searchBy") String searchBy);

  @GET("/v1/cats")
  Observable<List> getGatitos();

  @POST("/v1/cats")
  Observable<ComplexCat> postGatitos(
      @Body ComplexCat complexCat);

  @GET("/v1/cats/{catId}")
  Observable<ComplexCat> getGatitoByIdAndClientSecretAndOrderByAndFilterBy(
      @Path("catId") String catId,
      @Query("clientSecret") String clientSecret,
      @Query("orderBy") String orderBy,
      @Query("filterBy") String filterBy);

  @GET("/v1/cats/{catId}")
  Observable<ComplexCat> getGatitoByIdAndOrderByAndFilterBy(
      @Path("catId") String catId,
      @Query("orderBy") String orderBy,
      @Query("filterBy") String filterBy);

  @GET("/v1/cats/{catId}")
  Observable<ComplexCat> getGatitoByIdAndClientSecretAndFilterBy(
      @Path("catId") String catId,
      @Query("clientSecret") String clientSecret,
      @Query("filterBy") String filterBy);

  @GET("/v1/cats/{catId}")
  Observable<ComplexCat> getGatitoByIdAndFilterBy(
      @Path("catId") String catId,
      @Query("filterBy") String filterBy);

  @GET("/v1/cats/{catId}")
  Observable<ComplexCat> getGatitoByIdAndClientSecretAndOrderBy(
      @Path("catId") String catId,
      @Query("clientSecret") String clientSecret,
      @Query("orderBy") String orderBy);

  @GET("/v1/cats/{catId}")
  Observable<ComplexCat> getGatitoByIdAndOrderBy(
      @Path("catId") String catId,
      @Query("orderBy") String orderBy);

  @GET("/v1/cats/{catId}")
  Observable<ComplexCat> getGatitoByIdAndClientSecret(
      @Path("catId") String catId,
      @Query("clientSecret") String clientSecret);

  @GET("/v1/cats/{catId}")
  Observable<ComplexCat> getGatitoById(
      @Path("catId") String catId);

  @PUT("/v1/cats/{catId}")
  Observable<ComplexCat> putGatitoById(
      @Path("catId") String catId,
      @Body ComplexCat complexCat);

  @GET("/v1/cats/{catId}/mapping")
  Observable<ComplexCat> getSingleContentTypeMapping(
      @Path("catId") String catId);

  @POST("/v1/cats/{catId}/picture")
  @Multipart
  Observable<ComplexCat> postGatitoByIdPicture(
      @Path("catId") String catId,
      @Part("file") TypedFile file);

  @POST("/v1/cats/{catId}/webFormCat")
  @FormUrlEncoded
  Observable<ComplexCat> postGatitopByIdForm(
      @Path("catId") String catId,
      @Field("name") String name);

}
