// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BikeSharingService.proto

package com.example.BikeSharingService;

public interface ReserveAndUnlockBikeResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BikeSharingService.ReserveAndUnlockBikeResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string reservation_id = 1;</code>
   */
  java.lang.String getReservationId();
  /**
   * <code>string reservation_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getReservationIdBytes();

  /**
   * <pre>
   * Status code indicating success or failure of the reservation
   * </pre>
   *
   * <code>int32 status_code = 2;</code>
   */
  int getStatusCode();

  /**
   * <pre>
   * The ID of the bike to unlock
   * </pre>
   *
   * <code>string bike_id = 3;</code>
   */
  java.lang.String getBikeId();
  /**
   * <pre>
   * The ID of the bike to unlock
   * </pre>
   *
   * <code>string bike_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getBikeIdBytes();

  /**
   * <pre>
   * The time until which the bike can be unlocked
   * </pre>
   *
   * <code>string unlock_expiration_time = 4;</code>
   */
  java.lang.String getUnlockExpirationTime();
  /**
   * <pre>
   * The time until which the bike can be unlocked
   * </pre>
   *
   * <code>string unlock_expiration_time = 4;</code>
   */
  com.google.protobuf.ByteString
      getUnlockExpirationTimeBytes();

  /**
   * <pre>
   * A message providing status updates
   * </pre>
   *
   * <code>string update_message = 5;</code>
   */
  java.lang.String getUpdateMessage();
  /**
   * <pre>
   * A message providing status updates
   * </pre>
   *
   * <code>string update_message = 5;</code>
   */
  com.google.protobuf.ByteString
      getUpdateMessageBytes();
}
