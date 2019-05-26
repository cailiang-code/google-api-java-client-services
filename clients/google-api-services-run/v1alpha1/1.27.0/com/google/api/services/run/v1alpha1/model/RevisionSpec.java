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

package com.google.api.services.run.v1alpha1.model;

/**
 * RevisionSpec holds the desired state of the Revision (from the client).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RevisionSpec extends com.google.api.client.json.GenericJson {

  /**
   * ConcurrencyModel specifies the desired concurrency model (Single or Multi) for the Revision.
   * Defaults to Multi. Deprecated in favor of ContainerConcurrency. +optional
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String concurrencyModel;

  /**
   * Container defines the unit of execution for this Revision. In the context of a Revision, we
   * disallow a number of the fields of this Container, including: name, ports, and volumeMounts.
   * The runtime contract is documented here: https://github.com/knative/serving/blob/master/docs
   * /runtime-contract.md
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Container container;

  /**
   * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per
   * container of the Revision. Values are: - `0` thread-safe, the system should manage the max
   * concurrency. This is    the default value. - `1` not-thread-safe. Single concurrency - `2-N`
   * thread-safe, max concurrency of N
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer containerConcurrency;

  /**
   * Containers holds the single container that defines the unit of execution for this Revision. In
   * the context of a Revision, we disallow a number of fields on this Container, including: name
   * and lifecycle.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Container> containers;

  static {
    // hack to force ProGuard to consider Container used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Container.class);
  }

  /**
   * Deprecated and not currently populated by Cloud Run. See metadata.generation instead, which is
   * the sequence number containing the latest generation of the desired state.
   *
   * Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer generation;

  /**
   * Not currently used by Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccountName;

  /**
   * ServingState holds a value describing the state the resources are in for this Revision. Users
   * must not specify this when creating a revision. It is expected that the system will manipulate
   * this based on routability and load.
   *
   * Populated by the system. Read-only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String servingState;

  /**
   * TimeoutSeconds holds the max duration the instance is allowed for responding to a request. Not
   * currently used by Cloud Run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timeoutSeconds;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Volume> volumes;

  /**
   * ConcurrencyModel specifies the desired concurrency model (Single or Multi) for the Revision.
   * Defaults to Multi. Deprecated in favor of ContainerConcurrency. +optional
   * @return value or {@code null} for none
   */
  public java.lang.String getConcurrencyModel() {
    return concurrencyModel;
  }

  /**
   * ConcurrencyModel specifies the desired concurrency model (Single or Multi) for the Revision.
   * Defaults to Multi. Deprecated in favor of ContainerConcurrency. +optional
   * @param concurrencyModel concurrencyModel or {@code null} for none
   */
  public RevisionSpec setConcurrencyModel(java.lang.String concurrencyModel) {
    this.concurrencyModel = concurrencyModel;
    return this;
  }

  /**
   * Container defines the unit of execution for this Revision. In the context of a Revision, we
   * disallow a number of the fields of this Container, including: name, ports, and volumeMounts.
   * The runtime contract is documented here: https://github.com/knative/serving/blob/master/docs
   * /runtime-contract.md
   * @return value or {@code null} for none
   */
  public Container getContainer() {
    return container;
  }

  /**
   * Container defines the unit of execution for this Revision. In the context of a Revision, we
   * disallow a number of the fields of this Container, including: name, ports, and volumeMounts.
   * The runtime contract is documented here: https://github.com/knative/serving/blob/master/docs
   * /runtime-contract.md
   * @param container container or {@code null} for none
   */
  public RevisionSpec setContainer(Container container) {
    this.container = container;
    return this;
  }

  /**
   * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per
   * container of the Revision. Values are: - `0` thread-safe, the system should manage the max
   * concurrency. This is    the default value. - `1` not-thread-safe. Single concurrency - `2-N`
   * thread-safe, max concurrency of N
   * @return value or {@code null} for none
   */
  public java.lang.Integer getContainerConcurrency() {
    return containerConcurrency;
  }

  /**
   * ContainerConcurrency specifies the maximum allowed in-flight (concurrent) requests per
   * container of the Revision. Values are: - `0` thread-safe, the system should manage the max
   * concurrency. This is    the default value. - `1` not-thread-safe. Single concurrency - `2-N`
   * thread-safe, max concurrency of N
   * @param containerConcurrency containerConcurrency or {@code null} for none
   */
  public RevisionSpec setContainerConcurrency(java.lang.Integer containerConcurrency) {
    this.containerConcurrency = containerConcurrency;
    return this;
  }

  /**
   * Containers holds the single container that defines the unit of execution for this Revision. In
   * the context of a Revision, we disallow a number of fields on this Container, including: name
   * and lifecycle.
   * @return value or {@code null} for none
   */
  public java.util.List<Container> getContainers() {
    return containers;
  }

  /**
   * Containers holds the single container that defines the unit of execution for this Revision. In
   * the context of a Revision, we disallow a number of fields on this Container, including: name
   * and lifecycle.
   * @param containers containers or {@code null} for none
   */
  public RevisionSpec setContainers(java.util.List<Container> containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Deprecated and not currently populated by Cloud Run. See metadata.generation instead, which is
   * the sequence number containing the latest generation of the desired state.
   *
   * Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getGeneration() {
    return generation;
  }

  /**
   * Deprecated and not currently populated by Cloud Run. See metadata.generation instead, which is
   * the sequence number containing the latest generation of the desired state.
   *
   * Read-only.
   * @param generation generation or {@code null} for none
   */
  public RevisionSpec setGeneration(java.lang.Integer generation) {
    this.generation = generation;
    return this;
  }

  /**
   * Not currently used by Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccountName() {
    return serviceAccountName;
  }

  /**
   * Not currently used by Cloud Run.
   * @param serviceAccountName serviceAccountName or {@code null} for none
   */
  public RevisionSpec setServiceAccountName(java.lang.String serviceAccountName) {
    this.serviceAccountName = serviceAccountName;
    return this;
  }

  /**
   * ServingState holds a value describing the state the resources are in for this Revision. Users
   * must not specify this when creating a revision. It is expected that the system will manipulate
   * this based on routability and load.
   *
   * Populated by the system. Read-only.
   * @return value or {@code null} for none
   */
  public java.lang.String getServingState() {
    return servingState;
  }

  /**
   * ServingState holds a value describing the state the resources are in for this Revision. Users
   * must not specify this when creating a revision. It is expected that the system will manipulate
   * this based on routability and load.
   *
   * Populated by the system. Read-only.
   * @param servingState servingState or {@code null} for none
   */
  public RevisionSpec setServingState(java.lang.String servingState) {
    this.servingState = servingState;
    return this;
  }

  /**
   * TimeoutSeconds holds the max duration the instance is allowed for responding to a request. Not
   * currently used by Cloud Run.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  /**
   * TimeoutSeconds holds the max duration the instance is allowed for responding to a request. Not
   * currently used by Cloud Run.
   * @param timeoutSeconds timeoutSeconds or {@code null} for none
   */
  public RevisionSpec setTimeoutSeconds(java.lang.Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Volume> getVolumes() {
    return volumes;
  }

  /**
   * @param volumes volumes or {@code null} for none
   */
  public RevisionSpec setVolumes(java.util.List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  @Override
  public RevisionSpec set(String fieldName, Object value) {
    return (RevisionSpec) super.set(fieldName, value);
  }

  @Override
  public RevisionSpec clone() {
    return (RevisionSpec) super.clone();
  }

}
