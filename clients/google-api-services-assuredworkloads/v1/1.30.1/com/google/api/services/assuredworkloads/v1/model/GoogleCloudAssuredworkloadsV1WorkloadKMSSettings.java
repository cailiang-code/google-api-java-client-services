/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.assuredworkloads.v1.model;

/**
 * Settings specific to the Key Management Service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Assured Workloads API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAssuredworkloadsV1WorkloadKMSSettings extends com.google.api.client.json.GenericJson {

  /**
   * Required. Input only. Immutable. The time at which the Key Management Service will
   * automatically create a new version of the crypto key and mark it as the primary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String nextRotationTime;

  /**
   * Required. Input only. Immutable. [next_rotation_time] will be advanced by this period when the
   * Key Management Service automatically rotates a key. Must be at least 24 hours and at most
   * 876,000 hours.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String rotationPeriod;

  /**
   * Required. Input only. Immutable. The time at which the Key Management Service will
   * automatically create a new version of the crypto key and mark it as the primary.
   * @return value or {@code null} for none
   */
  public String getNextRotationTime() {
    return nextRotationTime;
  }

  /**
   * Required. Input only. Immutable. The time at which the Key Management Service will
   * automatically create a new version of the crypto key and mark it as the primary.
   * @param nextRotationTime nextRotationTime or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1WorkloadKMSSettings setNextRotationTime(String nextRotationTime) {
    this.nextRotationTime = nextRotationTime;
    return this;
  }

  /**
   * Required. Input only. Immutable. [next_rotation_time] will be advanced by this period when the
   * Key Management Service automatically rotates a key. Must be at least 24 hours and at most
   * 876,000 hours.
   * @return value or {@code null} for none
   */
  public String getRotationPeriod() {
    return rotationPeriod;
  }

  /**
   * Required. Input only. Immutable. [next_rotation_time] will be advanced by this period when the
   * Key Management Service automatically rotates a key. Must be at least 24 hours and at most
   * 876,000 hours.
   * @param rotationPeriod rotationPeriod or {@code null} for none
   */
  public GoogleCloudAssuredworkloadsV1WorkloadKMSSettings setRotationPeriod(String rotationPeriod) {
    this.rotationPeriod = rotationPeriod;
    return this;
  }

  @Override
  public GoogleCloudAssuredworkloadsV1WorkloadKMSSettings set(String fieldName, Object value) {
    return (GoogleCloudAssuredworkloadsV1WorkloadKMSSettings) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAssuredworkloadsV1WorkloadKMSSettings clone() {
    return (GoogleCloudAssuredworkloadsV1WorkloadKMSSettings) super.clone();
  }

}
