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

package com.google.api.services.analyticsreporting.v4.model;

/**
 * A contiguous set of days: startDate, startDate + 1 day, ..., endDate. The start and end dates are
 * specified in [ISO8601](https://en.wikipedia.org/wiki/ISO_8601) date format `YYYY-MM-DD`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Analytics Reporting API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DateRange extends com.google.api.client.json.GenericJson {

  /**
   * The end date for the query in the format `YYYY-MM-DD`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endDate;

  /**
   * The start date for the query in the format `YYYY-MM-DD`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startDate;

  /**
   * The end date for the query in the format `YYYY-MM-DD`.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndDate() {
    return endDate;
  }

  /**
   * The end date for the query in the format `YYYY-MM-DD`.
   * @param endDate endDate or {@code null} for none
   */
  public DateRange setEndDate(java.lang.String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The start date for the query in the format `YYYY-MM-DD`.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartDate() {
    return startDate;
  }

  /**
   * The start date for the query in the format `YYYY-MM-DD`.
   * @param startDate startDate or {@code null} for none
   */
  public DateRange setStartDate(java.lang.String startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public DateRange set(String fieldName, Object value) {
    return (DateRange) super.set(fieldName, value);
  }

  @Override
  public DateRange clone() {
    return (DateRange) super.clone();
  }

}
