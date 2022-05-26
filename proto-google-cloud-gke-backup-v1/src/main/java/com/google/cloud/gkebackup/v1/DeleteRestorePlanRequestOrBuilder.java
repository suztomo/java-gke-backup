/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/gkebackup/v1/gkebackup.proto

package com.google.cloud.gkebackup.v1;

public interface DeleteRestorePlanRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.DeleteRestorePlanRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Fully qualified RestorePlan name.
   * Format: projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Fully qualified RestorePlan name.
   * Format: projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * If provided, this value must match the current value of the
   * target RestorePlan's [etag][google.cloud.gkebackup.v1.RestorePlan.etag] field or the request is
   * rejected.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * If provided, this value must match the current value of the
   * target RestorePlan's [etag][google.cloud.gkebackup.v1.RestorePlan.etag] field or the request is
   * rejected.
   * </pre>
   *
   * <code>string etag = 2;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * If set to true, any Restores below this RestorePlan will also be deleted.
   * Otherwise, the request will only succeed if the RestorePlan has no
   * Restores.
   * </pre>
   *
   * <code>bool force = 3;</code>
   *
   * @return The force.
   */
  boolean getForce();
}
