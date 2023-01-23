package com.cinemaoperations;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Cinema.proto")
public final class CinemaOperationsServiceGrpc {

  private CinemaOperationsServiceGrpc() {}

  public static final String SERVICE_NAME = "CinemaOperationsService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.SeatGetAllRequest,
      com.cinemaoperations.SeatGetAllResponse> getGetAllSeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllSeat",
      requestType = com.cinemaoperations.SeatGetAllRequest.class,
      responseType = com.cinemaoperations.SeatGetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.SeatGetAllRequest,
      com.cinemaoperations.SeatGetAllResponse> getGetAllSeatMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.SeatGetAllRequest, com.cinemaoperations.SeatGetAllResponse> getGetAllSeatMethod;
    if ((getGetAllSeatMethod = CinemaOperationsServiceGrpc.getGetAllSeatMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getGetAllSeatMethod = CinemaOperationsServiceGrpc.getGetAllSeatMethod) == null) {
          CinemaOperationsServiceGrpc.getGetAllSeatMethod = getGetAllSeatMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.SeatGetAllRequest, com.cinemaoperations.SeatGetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "GetAllSeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SeatGetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SeatGetAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("GetAllSeat"))
                  .build();
          }
        }
     }
     return getGetAllSeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.SeatUpdateRequest,
      com.cinemaoperations.SeatUpdateResponse> getUpdateSeatStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSeatStatus",
      requestType = com.cinemaoperations.SeatUpdateRequest.class,
      responseType = com.cinemaoperations.SeatUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.SeatUpdateRequest,
      com.cinemaoperations.SeatUpdateResponse> getUpdateSeatStatusMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.SeatUpdateRequest, com.cinemaoperations.SeatUpdateResponse> getUpdateSeatStatusMethod;
    if ((getUpdateSeatStatusMethod = CinemaOperationsServiceGrpc.getUpdateSeatStatusMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getUpdateSeatStatusMethod = CinemaOperationsServiceGrpc.getUpdateSeatStatusMethod) == null) {
          CinemaOperationsServiceGrpc.getUpdateSeatStatusMethod = getUpdateSeatStatusMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.SeatUpdateRequest, com.cinemaoperations.SeatUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "UpdateSeatStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SeatUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SeatUpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("UpdateSeatStatus"))
                  .build();
          }
        }
     }
     return getUpdateSeatStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountGetAllRequest,
      com.cinemaoperations.MovieAmountGetAllResponse> getGetAllMovieAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllMovieAmount",
      requestType = com.cinemaoperations.MovieAmountGetAllRequest.class,
      responseType = com.cinemaoperations.MovieAmountGetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountGetAllRequest,
      com.cinemaoperations.MovieAmountGetAllResponse> getGetAllMovieAmountMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountGetAllRequest, com.cinemaoperations.MovieAmountGetAllResponse> getGetAllMovieAmountMethod;
    if ((getGetAllMovieAmountMethod = CinemaOperationsServiceGrpc.getGetAllMovieAmountMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getGetAllMovieAmountMethod = CinemaOperationsServiceGrpc.getGetAllMovieAmountMethod) == null) {
          CinemaOperationsServiceGrpc.getGetAllMovieAmountMethod = getGetAllMovieAmountMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.MovieAmountGetAllRequest, com.cinemaoperations.MovieAmountGetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "GetAllMovieAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.MovieAmountGetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.MovieAmountGetAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("GetAllMovieAmount"))
                  .build();
          }
        }
     }
     return getGetAllMovieAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountUpdateRequest,
      com.cinemaoperations.MovieAmountUpdateResponse> getUpdateMovieAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMovieAmount",
      requestType = com.cinemaoperations.MovieAmountUpdateRequest.class,
      responseType = com.cinemaoperations.MovieAmountUpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountUpdateRequest,
      com.cinemaoperations.MovieAmountUpdateResponse> getUpdateMovieAmountMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountUpdateRequest, com.cinemaoperations.MovieAmountUpdateResponse> getUpdateMovieAmountMethod;
    if ((getUpdateMovieAmountMethod = CinemaOperationsServiceGrpc.getUpdateMovieAmountMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getUpdateMovieAmountMethod = CinemaOperationsServiceGrpc.getUpdateMovieAmountMethod) == null) {
          CinemaOperationsServiceGrpc.getUpdateMovieAmountMethod = getUpdateMovieAmountMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.MovieAmountUpdateRequest, com.cinemaoperations.MovieAmountUpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "UpdateMovieAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.MovieAmountUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.MovieAmountUpdateResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("UpdateMovieAmount"))
                  .build();
          }
        }
     }
     return getUpdateMovieAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountInsertRequest,
      com.cinemaoperations.MovieAmountInsertResponse> getInsertMovieAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertMovieAmount",
      requestType = com.cinemaoperations.MovieAmountInsertRequest.class,
      responseType = com.cinemaoperations.MovieAmountInsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountInsertRequest,
      com.cinemaoperations.MovieAmountInsertResponse> getInsertMovieAmountMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountInsertRequest, com.cinemaoperations.MovieAmountInsertResponse> getInsertMovieAmountMethod;
    if ((getInsertMovieAmountMethod = CinemaOperationsServiceGrpc.getInsertMovieAmountMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getInsertMovieAmountMethod = CinemaOperationsServiceGrpc.getInsertMovieAmountMethod) == null) {
          CinemaOperationsServiceGrpc.getInsertMovieAmountMethod = getInsertMovieAmountMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.MovieAmountInsertRequest, com.cinemaoperations.MovieAmountInsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "InsertMovieAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.MovieAmountInsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.MovieAmountInsertResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("InsertMovieAmount"))
                  .build();
          }
        }
     }
     return getInsertMovieAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountDeleteRequest,
      com.cinemaoperations.MovieAmountDeleteResponse> getDeleteMovieAmountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMovieAmount",
      requestType = com.cinemaoperations.MovieAmountDeleteRequest.class,
      responseType = com.cinemaoperations.MovieAmountDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountDeleteRequest,
      com.cinemaoperations.MovieAmountDeleteResponse> getDeleteMovieAmountMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.MovieAmountDeleteRequest, com.cinemaoperations.MovieAmountDeleteResponse> getDeleteMovieAmountMethod;
    if ((getDeleteMovieAmountMethod = CinemaOperationsServiceGrpc.getDeleteMovieAmountMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getDeleteMovieAmountMethod = CinemaOperationsServiceGrpc.getDeleteMovieAmountMethod) == null) {
          CinemaOperationsServiceGrpc.getDeleteMovieAmountMethod = getDeleteMovieAmountMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.MovieAmountDeleteRequest, com.cinemaoperations.MovieAmountDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "DeleteMovieAmount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.MovieAmountDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.MovieAmountDeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("DeleteMovieAmount"))
                  .build();
          }
        }
     }
     return getDeleteMovieAmountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.CardInfoGetAllRequest,
      com.cinemaoperations.CardInfoGetAllResponse> getGetAllCardInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllCardInfo",
      requestType = com.cinemaoperations.CardInfoGetAllRequest.class,
      responseType = com.cinemaoperations.CardInfoGetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.CardInfoGetAllRequest,
      com.cinemaoperations.CardInfoGetAllResponse> getGetAllCardInfoMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.CardInfoGetAllRequest, com.cinemaoperations.CardInfoGetAllResponse> getGetAllCardInfoMethod;
    if ((getGetAllCardInfoMethod = CinemaOperationsServiceGrpc.getGetAllCardInfoMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getGetAllCardInfoMethod = CinemaOperationsServiceGrpc.getGetAllCardInfoMethod) == null) {
          CinemaOperationsServiceGrpc.getGetAllCardInfoMethod = getGetAllCardInfoMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.CardInfoGetAllRequest, com.cinemaoperations.CardInfoGetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "GetAllCardInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.CardInfoGetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.CardInfoGetAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("GetAllCardInfo"))
                  .build();
          }
        }
     }
     return getGetAllCardInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieGetAllRequest,
      com.cinemaoperations.SalesMovieGetAllResponse> getGetAllSalesMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllSalesMovie",
      requestType = com.cinemaoperations.SalesMovieGetAllRequest.class,
      responseType = com.cinemaoperations.SalesMovieGetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieGetAllRequest,
      com.cinemaoperations.SalesMovieGetAllResponse> getGetAllSalesMovieMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieGetAllRequest, com.cinemaoperations.SalesMovieGetAllResponse> getGetAllSalesMovieMethod;
    if ((getGetAllSalesMovieMethod = CinemaOperationsServiceGrpc.getGetAllSalesMovieMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getGetAllSalesMovieMethod = CinemaOperationsServiceGrpc.getGetAllSalesMovieMethod) == null) {
          CinemaOperationsServiceGrpc.getGetAllSalesMovieMethod = getGetAllSalesMovieMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.SalesMovieGetAllRequest, com.cinemaoperations.SalesMovieGetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "GetAllSalesMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SalesMovieGetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SalesMovieGetAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("GetAllSalesMovie"))
                  .build();
          }
        }
     }
     return getGetAllSalesMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieInsertRequest,
      com.cinemaoperations.SalesMovieInsertResponse> getInsertSalesMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InsertSalesMovie",
      requestType = com.cinemaoperations.SalesMovieInsertRequest.class,
      responseType = com.cinemaoperations.SalesMovieInsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieInsertRequest,
      com.cinemaoperations.SalesMovieInsertResponse> getInsertSalesMovieMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieInsertRequest, com.cinemaoperations.SalesMovieInsertResponse> getInsertSalesMovieMethod;
    if ((getInsertSalesMovieMethod = CinemaOperationsServiceGrpc.getInsertSalesMovieMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getInsertSalesMovieMethod = CinemaOperationsServiceGrpc.getInsertSalesMovieMethod) == null) {
          CinemaOperationsServiceGrpc.getInsertSalesMovieMethod = getInsertSalesMovieMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.SalesMovieInsertRequest, com.cinemaoperations.SalesMovieInsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "InsertSalesMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SalesMovieInsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SalesMovieInsertResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("InsertSalesMovie"))
                  .build();
          }
        }
     }
     return getInsertSalesMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieDeleteRequest,
      com.cinemaoperations.SalesMovieDeleteResponse> getDeleteSalesMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSalesMovie",
      requestType = com.cinemaoperations.SalesMovieDeleteRequest.class,
      responseType = com.cinemaoperations.SalesMovieDeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieDeleteRequest,
      com.cinemaoperations.SalesMovieDeleteResponse> getDeleteSalesMovieMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieDeleteRequest, com.cinemaoperations.SalesMovieDeleteResponse> getDeleteSalesMovieMethod;
    if ((getDeleteSalesMovieMethod = CinemaOperationsServiceGrpc.getDeleteSalesMovieMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getDeleteSalesMovieMethod = CinemaOperationsServiceGrpc.getDeleteSalesMovieMethod) == null) {
          CinemaOperationsServiceGrpc.getDeleteSalesMovieMethod = getDeleteSalesMovieMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.SalesMovieDeleteRequest, com.cinemaoperations.SalesMovieDeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "DeleteSalesMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SalesMovieDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SalesMovieDeleteResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("DeleteSalesMovie"))
                  .build();
          }
        }
     }
     return getDeleteSalesMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieCancelRequest,
      com.cinemaoperations.SalesMovieCancelResponse> getCancelSalesMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelSalesMovie",
      requestType = com.cinemaoperations.SalesMovieCancelRequest.class,
      responseType = com.cinemaoperations.SalesMovieCancelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieCancelRequest,
      com.cinemaoperations.SalesMovieCancelResponse> getCancelSalesMovieMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.SalesMovieCancelRequest, com.cinemaoperations.SalesMovieCancelResponse> getCancelSalesMovieMethod;
    if ((getCancelSalesMovieMethod = CinemaOperationsServiceGrpc.getCancelSalesMovieMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getCancelSalesMovieMethod = CinemaOperationsServiceGrpc.getCancelSalesMovieMethod) == null) {
          CinemaOperationsServiceGrpc.getCancelSalesMovieMethod = getCancelSalesMovieMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.SalesMovieCancelRequest, com.cinemaoperations.SalesMovieCancelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "CancelSalesMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SalesMovieCancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.SalesMovieCancelResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("CancelSalesMovie"))
                  .build();
          }
        }
     }
     return getCancelSalesMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.CanceledSalesMovieGetAllRequest,
      com.cinemaoperations.CanceledSalesMovieGetAllResponse> getCanceledGetAllSalesMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CanceledGetAllSalesMovie",
      requestType = com.cinemaoperations.CanceledSalesMovieGetAllRequest.class,
      responseType = com.cinemaoperations.CanceledSalesMovieGetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.CanceledSalesMovieGetAllRequest,
      com.cinemaoperations.CanceledSalesMovieGetAllResponse> getCanceledGetAllSalesMovieMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.CanceledSalesMovieGetAllRequest, com.cinemaoperations.CanceledSalesMovieGetAllResponse> getCanceledGetAllSalesMovieMethod;
    if ((getCanceledGetAllSalesMovieMethod = CinemaOperationsServiceGrpc.getCanceledGetAllSalesMovieMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getCanceledGetAllSalesMovieMethod = CinemaOperationsServiceGrpc.getCanceledGetAllSalesMovieMethod) == null) {
          CinemaOperationsServiceGrpc.getCanceledGetAllSalesMovieMethod = getCanceledGetAllSalesMovieMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.CanceledSalesMovieGetAllRequest, com.cinemaoperations.CanceledSalesMovieGetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "CanceledGetAllSalesMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.CanceledSalesMovieGetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.CanceledSalesMovieGetAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("CanceledGetAllSalesMovie"))
                  .build();
          }
        }
     }
     return getCanceledGetAllSalesMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest,
      com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse> getChangedAllCanceledSalesMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangedAllCanceledSalesMovie",
      requestType = com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest.class,
      responseType = com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest,
      com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse> getChangedAllCanceledSalesMovieMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest, com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse> getChangedAllCanceledSalesMovieMethod;
    if ((getChangedAllCanceledSalesMovieMethod = CinemaOperationsServiceGrpc.getChangedAllCanceledSalesMovieMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getChangedAllCanceledSalesMovieMethod = CinemaOperationsServiceGrpc.getChangedAllCanceledSalesMovieMethod) == null) {
          CinemaOperationsServiceGrpc.getChangedAllCanceledSalesMovieMethod = getChangedAllCanceledSalesMovieMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest, com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "ChangedAllCanceledSalesMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("ChangedAllCanceledSalesMovie"))
                  .build();
          }
        }
     }
     return getChangedAllCanceledSalesMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cinemaoperations.DeleteAllCanceledSalesMovieRequest,
      com.cinemaoperations.DeleteAllChangeledSalesMovieResponse> getDeleteAllCanceledSalesMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteAllCanceledSalesMovie",
      requestType = com.cinemaoperations.DeleteAllCanceledSalesMovieRequest.class,
      responseType = com.cinemaoperations.DeleteAllChangeledSalesMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cinemaoperations.DeleteAllCanceledSalesMovieRequest,
      com.cinemaoperations.DeleteAllChangeledSalesMovieResponse> getDeleteAllCanceledSalesMovieMethod() {
    io.grpc.MethodDescriptor<com.cinemaoperations.DeleteAllCanceledSalesMovieRequest, com.cinemaoperations.DeleteAllChangeledSalesMovieResponse> getDeleteAllCanceledSalesMovieMethod;
    if ((getDeleteAllCanceledSalesMovieMethod = CinemaOperationsServiceGrpc.getDeleteAllCanceledSalesMovieMethod) == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        if ((getDeleteAllCanceledSalesMovieMethod = CinemaOperationsServiceGrpc.getDeleteAllCanceledSalesMovieMethod) == null) {
          CinemaOperationsServiceGrpc.getDeleteAllCanceledSalesMovieMethod = getDeleteAllCanceledSalesMovieMethod = 
              io.grpc.MethodDescriptor.<com.cinemaoperations.DeleteAllCanceledSalesMovieRequest, com.cinemaoperations.DeleteAllChangeledSalesMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "CinemaOperationsService", "deleteAllCanceledSalesMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.DeleteAllCanceledSalesMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cinemaoperations.DeleteAllChangeledSalesMovieResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CinemaOperationsServiceMethodDescriptorSupplier("deleteAllCanceledSalesMovie"))
                  .build();
          }
        }
     }
     return getDeleteAllCanceledSalesMovieMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CinemaOperationsServiceStub newStub(io.grpc.Channel channel) {
    return new CinemaOperationsServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CinemaOperationsServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CinemaOperationsServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CinemaOperationsServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CinemaOperationsServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CinemaOperationsServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllSeat(com.cinemaoperations.SeatGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SeatGetAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllSeatMethod(), responseObserver);
    }

    /**
     */
    public void updateSeatStatus(com.cinemaoperations.SeatUpdateRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SeatUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateSeatStatusMethod(), responseObserver);
    }

    /**
     */
    public void getAllMovieAmount(com.cinemaoperations.MovieAmountGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountGetAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMovieAmountMethod(), responseObserver);
    }

    /**
     */
    public void updateMovieAmount(com.cinemaoperations.MovieAmountUpdateRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountUpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMovieAmountMethod(), responseObserver);
    }

    /**
     */
    public void insertMovieAmount(com.cinemaoperations.MovieAmountInsertRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountInsertResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertMovieAmountMethod(), responseObserver);
    }

    /**
     */
    public void deleteMovieAmount(com.cinemaoperations.MovieAmountDeleteRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMovieAmountMethod(), responseObserver);
    }

    /**
     */
    public void getAllCardInfo(com.cinemaoperations.CardInfoGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.CardInfoGetAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllCardInfoMethod(), responseObserver);
    }

    /**
     */
    public void getAllSalesMovie(com.cinemaoperations.SalesMovieGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieGetAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllSalesMovieMethod(), responseObserver);
    }

    /**
     */
    public void insertSalesMovie(com.cinemaoperations.SalesMovieInsertRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieInsertResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertSalesMovieMethod(), responseObserver);
    }

    /**
     */
    public void deleteSalesMovie(com.cinemaoperations.SalesMovieDeleteRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieDeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteSalesMovieMethod(), responseObserver);
    }

    /**
     */
    public void cancelSalesMovie(com.cinemaoperations.SalesMovieCancelRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieCancelResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelSalesMovieMethod(), responseObserver);
    }

    /**
     */
    public void canceledGetAllSalesMovie(com.cinemaoperations.CanceledSalesMovieGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.CanceledSalesMovieGetAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCanceledGetAllSalesMovieMethod(), responseObserver);
    }

    /**
     */
    public void changedAllCanceledSalesMovie(com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getChangedAllCanceledSalesMovieMethod(), responseObserver);
    }

    /**
     */
    public void deleteAllCanceledSalesMovie(com.cinemaoperations.DeleteAllCanceledSalesMovieRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.DeleteAllChangeledSalesMovieResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteAllCanceledSalesMovieMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllSeatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.SeatGetAllRequest,
                com.cinemaoperations.SeatGetAllResponse>(
                  this, METHODID_GET_ALL_SEAT)))
          .addMethod(
            getUpdateSeatStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.SeatUpdateRequest,
                com.cinemaoperations.SeatUpdateResponse>(
                  this, METHODID_UPDATE_SEAT_STATUS)))
          .addMethod(
            getGetAllMovieAmountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.MovieAmountGetAllRequest,
                com.cinemaoperations.MovieAmountGetAllResponse>(
                  this, METHODID_GET_ALL_MOVIE_AMOUNT)))
          .addMethod(
            getUpdateMovieAmountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.MovieAmountUpdateRequest,
                com.cinemaoperations.MovieAmountUpdateResponse>(
                  this, METHODID_UPDATE_MOVIE_AMOUNT)))
          .addMethod(
            getInsertMovieAmountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.MovieAmountInsertRequest,
                com.cinemaoperations.MovieAmountInsertResponse>(
                  this, METHODID_INSERT_MOVIE_AMOUNT)))
          .addMethod(
            getDeleteMovieAmountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.MovieAmountDeleteRequest,
                com.cinemaoperations.MovieAmountDeleteResponse>(
                  this, METHODID_DELETE_MOVIE_AMOUNT)))
          .addMethod(
            getGetAllCardInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.CardInfoGetAllRequest,
                com.cinemaoperations.CardInfoGetAllResponse>(
                  this, METHODID_GET_ALL_CARD_INFO)))
          .addMethod(
            getGetAllSalesMovieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.SalesMovieGetAllRequest,
                com.cinemaoperations.SalesMovieGetAllResponse>(
                  this, METHODID_GET_ALL_SALES_MOVIE)))
          .addMethod(
            getInsertSalesMovieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.SalesMovieInsertRequest,
                com.cinemaoperations.SalesMovieInsertResponse>(
                  this, METHODID_INSERT_SALES_MOVIE)))
          .addMethod(
            getDeleteSalesMovieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.SalesMovieDeleteRequest,
                com.cinemaoperations.SalesMovieDeleteResponse>(
                  this, METHODID_DELETE_SALES_MOVIE)))
          .addMethod(
            getCancelSalesMovieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.SalesMovieCancelRequest,
                com.cinemaoperations.SalesMovieCancelResponse>(
                  this, METHODID_CANCEL_SALES_MOVIE)))
          .addMethod(
            getCanceledGetAllSalesMovieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.CanceledSalesMovieGetAllRequest,
                com.cinemaoperations.CanceledSalesMovieGetAllResponse>(
                  this, METHODID_CANCELED_GET_ALL_SALES_MOVIE)))
          .addMethod(
            getChangedAllCanceledSalesMovieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest,
                com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse>(
                  this, METHODID_CHANGED_ALL_CANCELED_SALES_MOVIE)))
          .addMethod(
            getDeleteAllCanceledSalesMovieMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cinemaoperations.DeleteAllCanceledSalesMovieRequest,
                com.cinemaoperations.DeleteAllChangeledSalesMovieResponse>(
                  this, METHODID_DELETE_ALL_CANCELED_SALES_MOVIE)))
          .build();
    }
  }

  /**
   */
  public static final class CinemaOperationsServiceStub extends io.grpc.stub.AbstractStub<CinemaOperationsServiceStub> {
    private CinemaOperationsServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CinemaOperationsServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CinemaOperationsServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CinemaOperationsServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllSeat(com.cinemaoperations.SeatGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SeatGetAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllSeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSeatStatus(com.cinemaoperations.SeatUpdateRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SeatUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateSeatStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllMovieAmount(com.cinemaoperations.MovieAmountGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountGetAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllMovieAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMovieAmount(com.cinemaoperations.MovieAmountUpdateRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountUpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMovieAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertMovieAmount(com.cinemaoperations.MovieAmountInsertRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountInsertResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertMovieAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMovieAmount(com.cinemaoperations.MovieAmountDeleteRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMovieAmountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCardInfo(com.cinemaoperations.CardInfoGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.CardInfoGetAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllCardInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllSalesMovie(com.cinemaoperations.SalesMovieGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieGetAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllSalesMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void insertSalesMovie(com.cinemaoperations.SalesMovieInsertRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieInsertResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertSalesMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSalesMovie(com.cinemaoperations.SalesMovieDeleteRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieDeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteSalesMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelSalesMovie(com.cinemaoperations.SalesMovieCancelRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieCancelResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelSalesMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void canceledGetAllSalesMovie(com.cinemaoperations.CanceledSalesMovieGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.CanceledSalesMovieGetAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCanceledGetAllSalesMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changedAllCanceledSalesMovie(com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangedAllCanceledSalesMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAllCanceledSalesMovie(com.cinemaoperations.DeleteAllCanceledSalesMovieRequest request,
        io.grpc.stub.StreamObserver<com.cinemaoperations.DeleteAllChangeledSalesMovieResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteAllCanceledSalesMovieMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CinemaOperationsServiceBlockingStub extends io.grpc.stub.AbstractStub<CinemaOperationsServiceBlockingStub> {
    private CinemaOperationsServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CinemaOperationsServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CinemaOperationsServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CinemaOperationsServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cinemaoperations.SeatGetAllResponse getAllSeat(com.cinemaoperations.SeatGetAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllSeatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.SeatUpdateResponse updateSeatStatus(com.cinemaoperations.SeatUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateSeatStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.MovieAmountGetAllResponse getAllMovieAmount(com.cinemaoperations.MovieAmountGetAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllMovieAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.MovieAmountUpdateResponse updateMovieAmount(com.cinemaoperations.MovieAmountUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMovieAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.MovieAmountInsertResponse insertMovieAmount(com.cinemaoperations.MovieAmountInsertRequest request) {
      return blockingUnaryCall(
          getChannel(), getInsertMovieAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.MovieAmountDeleteResponse deleteMovieAmount(com.cinemaoperations.MovieAmountDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMovieAmountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.CardInfoGetAllResponse getAllCardInfo(com.cinemaoperations.CardInfoGetAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllCardInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.SalesMovieGetAllResponse getAllSalesMovie(com.cinemaoperations.SalesMovieGetAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllSalesMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.SalesMovieInsertResponse insertSalesMovie(com.cinemaoperations.SalesMovieInsertRequest request) {
      return blockingUnaryCall(
          getChannel(), getInsertSalesMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.SalesMovieDeleteResponse deleteSalesMovie(com.cinemaoperations.SalesMovieDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteSalesMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.SalesMovieCancelResponse cancelSalesMovie(com.cinemaoperations.SalesMovieCancelRequest request) {
      return blockingUnaryCall(
          getChannel(), getCancelSalesMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.CanceledSalesMovieGetAllResponse canceledGetAllSalesMovie(com.cinemaoperations.CanceledSalesMovieGetAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getCanceledGetAllSalesMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse changedAllCanceledSalesMovie(com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getChangedAllCanceledSalesMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cinemaoperations.DeleteAllChangeledSalesMovieResponse deleteAllCanceledSalesMovie(com.cinemaoperations.DeleteAllCanceledSalesMovieRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteAllCanceledSalesMovieMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CinemaOperationsServiceFutureStub extends io.grpc.stub.AbstractStub<CinemaOperationsServiceFutureStub> {
    private CinemaOperationsServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CinemaOperationsServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CinemaOperationsServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CinemaOperationsServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.SeatGetAllResponse> getAllSeat(
        com.cinemaoperations.SeatGetAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllSeatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.SeatUpdateResponse> updateSeatStatus(
        com.cinemaoperations.SeatUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateSeatStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.MovieAmountGetAllResponse> getAllMovieAmount(
        com.cinemaoperations.MovieAmountGetAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllMovieAmountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.MovieAmountUpdateResponse> updateMovieAmount(
        com.cinemaoperations.MovieAmountUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMovieAmountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.MovieAmountInsertResponse> insertMovieAmount(
        com.cinemaoperations.MovieAmountInsertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertMovieAmountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.MovieAmountDeleteResponse> deleteMovieAmount(
        com.cinemaoperations.MovieAmountDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMovieAmountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.CardInfoGetAllResponse> getAllCardInfo(
        com.cinemaoperations.CardInfoGetAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllCardInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.SalesMovieGetAllResponse> getAllSalesMovie(
        com.cinemaoperations.SalesMovieGetAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllSalesMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.SalesMovieInsertResponse> insertSalesMovie(
        com.cinemaoperations.SalesMovieInsertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertSalesMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.SalesMovieDeleteResponse> deleteSalesMovie(
        com.cinemaoperations.SalesMovieDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteSalesMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.SalesMovieCancelResponse> cancelSalesMovie(
        com.cinemaoperations.SalesMovieCancelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelSalesMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.CanceledSalesMovieGetAllResponse> canceledGetAllSalesMovie(
        com.cinemaoperations.CanceledSalesMovieGetAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCanceledGetAllSalesMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse> changedAllCanceledSalesMovie(
        com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getChangedAllCanceledSalesMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cinemaoperations.DeleteAllChangeledSalesMovieResponse> deleteAllCanceledSalesMovie(
        com.cinemaoperations.DeleteAllCanceledSalesMovieRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteAllCanceledSalesMovieMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_SEAT = 0;
  private static final int METHODID_UPDATE_SEAT_STATUS = 1;
  private static final int METHODID_GET_ALL_MOVIE_AMOUNT = 2;
  private static final int METHODID_UPDATE_MOVIE_AMOUNT = 3;
  private static final int METHODID_INSERT_MOVIE_AMOUNT = 4;
  private static final int METHODID_DELETE_MOVIE_AMOUNT = 5;
  private static final int METHODID_GET_ALL_CARD_INFO = 6;
  private static final int METHODID_GET_ALL_SALES_MOVIE = 7;
  private static final int METHODID_INSERT_SALES_MOVIE = 8;
  private static final int METHODID_DELETE_SALES_MOVIE = 9;
  private static final int METHODID_CANCEL_SALES_MOVIE = 10;
  private static final int METHODID_CANCELED_GET_ALL_SALES_MOVIE = 11;
  private static final int METHODID_CHANGED_ALL_CANCELED_SALES_MOVIE = 12;
  private static final int METHODID_DELETE_ALL_CANCELED_SALES_MOVIE = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CinemaOperationsServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CinemaOperationsServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_SEAT:
          serviceImpl.getAllSeat((com.cinemaoperations.SeatGetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.SeatGetAllResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SEAT_STATUS:
          serviceImpl.updateSeatStatus((com.cinemaoperations.SeatUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.SeatUpdateResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_MOVIE_AMOUNT:
          serviceImpl.getAllMovieAmount((com.cinemaoperations.MovieAmountGetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountGetAllResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MOVIE_AMOUNT:
          serviceImpl.updateMovieAmount((com.cinemaoperations.MovieAmountUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountUpdateResponse>) responseObserver);
          break;
        case METHODID_INSERT_MOVIE_AMOUNT:
          serviceImpl.insertMovieAmount((com.cinemaoperations.MovieAmountInsertRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountInsertResponse>) responseObserver);
          break;
        case METHODID_DELETE_MOVIE_AMOUNT:
          serviceImpl.deleteMovieAmount((com.cinemaoperations.MovieAmountDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.MovieAmountDeleteResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_CARD_INFO:
          serviceImpl.getAllCardInfo((com.cinemaoperations.CardInfoGetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.CardInfoGetAllResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_SALES_MOVIE:
          serviceImpl.getAllSalesMovie((com.cinemaoperations.SalesMovieGetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieGetAllResponse>) responseObserver);
          break;
        case METHODID_INSERT_SALES_MOVIE:
          serviceImpl.insertSalesMovie((com.cinemaoperations.SalesMovieInsertRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieInsertResponse>) responseObserver);
          break;
        case METHODID_DELETE_SALES_MOVIE:
          serviceImpl.deleteSalesMovie((com.cinemaoperations.SalesMovieDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieDeleteResponse>) responseObserver);
          break;
        case METHODID_CANCEL_SALES_MOVIE:
          serviceImpl.cancelSalesMovie((com.cinemaoperations.SalesMovieCancelRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.SalesMovieCancelResponse>) responseObserver);
          break;
        case METHODID_CANCELED_GET_ALL_SALES_MOVIE:
          serviceImpl.canceledGetAllSalesMovie((com.cinemaoperations.CanceledSalesMovieGetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.CanceledSalesMovieGetAllResponse>) responseObserver);
          break;
        case METHODID_CHANGED_ALL_CANCELED_SALES_MOVIE:
          serviceImpl.changedAllCanceledSalesMovie((com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.ChangedAllCanceledSalesMovieGetAllResponse>) responseObserver);
          break;
        case METHODID_DELETE_ALL_CANCELED_SALES_MOVIE:
          serviceImpl.deleteAllCanceledSalesMovie((com.cinemaoperations.DeleteAllCanceledSalesMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.cinemaoperations.DeleteAllChangeledSalesMovieResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CinemaOperationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CinemaOperationsServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cinemaoperations.Cinema.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CinemaOperationsService");
    }
  }

  private static final class CinemaOperationsServiceFileDescriptorSupplier
      extends CinemaOperationsServiceBaseDescriptorSupplier {
    CinemaOperationsServiceFileDescriptorSupplier() {}
  }

  private static final class CinemaOperationsServiceMethodDescriptorSupplier
      extends CinemaOperationsServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CinemaOperationsServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CinemaOperationsServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CinemaOperationsServiceFileDescriptorSupplier())
              .addMethod(getGetAllSeatMethod())
              .addMethod(getUpdateSeatStatusMethod())
              .addMethod(getGetAllMovieAmountMethod())
              .addMethod(getUpdateMovieAmountMethod())
              .addMethod(getInsertMovieAmountMethod())
              .addMethod(getDeleteMovieAmountMethod())
              .addMethod(getGetAllCardInfoMethod())
              .addMethod(getGetAllSalesMovieMethod())
              .addMethod(getInsertSalesMovieMethod())
              .addMethod(getDeleteSalesMovieMethod())
              .addMethod(getCancelSalesMovieMethod())
              .addMethod(getCanceledGetAllSalesMovieMethod())
              .addMethod(getChangedAllCanceledSalesMovieMethod())
              .addMethod(getDeleteAllCanceledSalesMovieMethod())
              .build();
        }
      }
    }
    return result;
  }
}
