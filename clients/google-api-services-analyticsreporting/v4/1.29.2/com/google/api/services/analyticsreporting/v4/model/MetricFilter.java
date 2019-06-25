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
 * MetricFilter specifies the filter on a metric.
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
public final class MetricFilter extends com.google.api.client.json.GenericJson {

  /**
   * The value to compare against.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comparisonValue;

  /**
   * The metric that will be filtered on. A metricFilter must contain a metric name. A metric name
   * can be an alias earlier defined as a metric or it can also be a metric expression.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metricName;

  /**
   * Logical `NOT` operator. If this boolean is set to true, then the matching metric values will be
   * excluded in the report. The default is false.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean not;

  /**
   * Is the metric `EQUAL`, `LESS_THAN` or `GREATER_THAN` the comparisonValue, the default is
   * `EQUAL`. If the operator is `IS_MISSING`, checks if the metric is missing and would ignore the
   * comparisonValue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operator;

  /**
   * The value to compare against.
   * @return value or {@code null} for none
   */
  public java.lang.String getComparisonValue() {
    return comparisonValue;
  }

  /**
   * The value to compare against.
   * @param comparisonValue comparisonValue or {@code null} for none
   */
  public MetricFilter setComparisonValue(java.lang.String comparisonValue) {
    this.comparisonValue = comparisonValue;
    return this;
  }

  /**
   * The metric that will be filtered on. A metricFilter must contain a metric name. A metric name
   * can be an alias earlier defined as a metric or it can also be a metric expression.
   * @return value or {@code null} for none
   */
  public java.lang.String getMetricName() {
    return metricName;
  }

  /**
   * The metric that will be filtered on. A metricFilter must contain a metric name. A metric name
   * can be an alias earlier defined as a metric or it can also be a metric expression.
   * @param metricName metricName or {@code null} for none
   */
  public MetricFilter setMetricName(java.lang.String metricName) {
    this.metricName = metricName;
    return this;
  }

  /**
   * Logical `NOT` operator. If this boolean is set to true, then the matching metric values will be
   * excluded in the report. The default is false.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNot() {
    return not;
  }

  /**
   * Logical `NOT` operator. If this boolean is set to true, then the matching metric values will be
   * excluded in the report. The default is false.
   * @param not not or {@code null} for none
   */
  public MetricFilter setNot(java.lang.Boolean not) {
    this.not = not;
    return this;
  }

  /**
   * Is the metric `EQUAL`, `LESS_THAN` or `GREATER_THAN` the comparisonValue, the default is
   * `EQUAL`. If the operator is `IS_MISSING`, checks if the metric is missing and would ignore the
   * comparisonValue.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperator() {
    return operator;
  }

  /**
   * Is the metric `EQUAL`, `LESS_THAN` or `GREATER_THAN` the comparisonValue, the default is
   * `EQUAL`. If the operator is `IS_MISSING`, checks if the metric is missing and would ignore the
   * comparisonValue.
   * @param operator operator or {@code null} for none
   */
  public MetricFilter setOperator(java.lang.String operator) {
    this.operator = operator;
    return this;
  }

  @Override
  public MetricFilter set(String fieldName, Object value) {
    return (MetricFilter) super.set(fieldName, value);
  }

  @Override
  public MetricFilter clone() {
    return (MetricFilter) super.clone();
  }

}
