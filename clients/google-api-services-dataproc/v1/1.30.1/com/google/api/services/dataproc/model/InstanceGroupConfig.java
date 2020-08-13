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

package com.google.api.services.dataproc.model;

/**
 * The config settings for Compute Engine resources in an instance group, such as a master or worker
 * group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceGroupConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The Compute Engine accelerator configuration for these instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AcceleratorConfig> accelerators;

  static {
    // hack to force ProGuard to consider AcceleratorConfig used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(AcceleratorConfig.class);
  }

  /**
   * Optional. Disk option config settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DiskConfig diskConfig;

  /**
   * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an
   * image or image family.Image examples:
   * https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id]
   * projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use
   * the most recent image from the family:
   * https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-
   * image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the
   * URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system
   * default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String imageUri;

  /**
   * Output only. The list of instance names. Dataproc derives the names from cluster_name,
   * num_instances, and the instance group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> instanceNames;

  /**
   * Output only. List of references to Compute Engine instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<InstanceReference> instanceReferences;

  /**
   * Output only. Specifies that this instance group contains preemptible instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPreemptible;

  /**
   * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI,
   * or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the
   * Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-
   * clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the
   * machine type resource, for example, n1-standard-2.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineTypeUri;

  /**
   * Output only. The config for Compute Engine Instance Group Manager that manages this group. This
   * is only used for preemptible instance groups.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ManagedGroupConfig managedGroupConfig;

  /**
   * Optional. Specifies the minimum cpu platform for the Instance Group. See Dataproc -> Minimum
   * CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String minCpuPlatform;

  /**
   * Optional. The number of VM instances in the instance group. For master instance groups, must be
   * set to 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numInstances;

  /**
   * Optional. Specifies the preemptibility of the instance group.The default value for master and
   * worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for
   * secondary instances is PREEMPTIBLE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String preemptibility;

  /**
   * Optional. The Compute Engine accelerator configuration for these instances.
   * @return value or {@code null} for none
   */
  public java.util.List<AcceleratorConfig> getAccelerators() {
    return accelerators;
  }

  /**
   * Optional. The Compute Engine accelerator configuration for these instances.
   * @param accelerators accelerators or {@code null} for none
   */
  public InstanceGroupConfig setAccelerators(java.util.List<AcceleratorConfig> accelerators) {
    this.accelerators = accelerators;
    return this;
  }

  /**
   * Optional. Disk option config settings.
   * @return value or {@code null} for none
   */
  public DiskConfig getDiskConfig() {
    return diskConfig;
  }

  /**
   * Optional. Disk option config settings.
   * @param diskConfig diskConfig or {@code null} for none
   */
  public InstanceGroupConfig setDiskConfig(DiskConfig diskConfig) {
    this.diskConfig = diskConfig;
    return this;
  }

  /**
   * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an
   * image or image family.Image examples:
   * https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id]
   * projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use
   * the most recent image from the family:
   * https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-
   * image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the
   * URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system
   * default.
   * @return value or {@code null} for none
   */
  public java.lang.String getImageUri() {
    return imageUri;
  }

  /**
   * Optional. The Compute Engine image resource used for cluster instances.The URI can represent an
   * image or image family.Image examples:
   * https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/[image-id]
   * projects/[project_id]/global/images/[image-id] image-idImage family examples. Dataproc will use
   * the most recent image from the family:
   * https://www.googleapis.com/compute/beta/projects/[project_id]/global/images/family/[custom-
   * image-family-name] projects/[project_id]/global/images/family/[custom-image-family-name]If the
   * URI is unspecified, it will be inferred from SoftwareConfig.image_version or the system
   * default.
   * @param imageUri imageUri or {@code null} for none
   */
  public InstanceGroupConfig setImageUri(java.lang.String imageUri) {
    this.imageUri = imageUri;
    return this;
  }

  /**
   * Output only. The list of instance names. Dataproc derives the names from cluster_name,
   * num_instances, and the instance group.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInstanceNames() {
    return instanceNames;
  }

  /**
   * Output only. The list of instance names. Dataproc derives the names from cluster_name,
   * num_instances, and the instance group.
   * @param instanceNames instanceNames or {@code null} for none
   */
  public InstanceGroupConfig setInstanceNames(java.util.List<java.lang.String> instanceNames) {
    this.instanceNames = instanceNames;
    return this;
  }

  /**
   * Output only. List of references to Compute Engine instances.
   * @return value or {@code null} for none
   */
  public java.util.List<InstanceReference> getInstanceReferences() {
    return instanceReferences;
  }

  /**
   * Output only. List of references to Compute Engine instances.
   * @param instanceReferences instanceReferences or {@code null} for none
   */
  public InstanceGroupConfig setInstanceReferences(java.util.List<InstanceReference> instanceReferences) {
    this.instanceReferences = instanceReferences;
    return this;
  }

  /**
   * Output only. Specifies that this instance group contains preemptible instances.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPreemptible() {
    return isPreemptible;
  }

  /**
   * Output only. Specifies that this instance group contains preemptible instances.
   * @param isPreemptible isPreemptible or {@code null} for none
   */
  public InstanceGroupConfig setIsPreemptible(java.lang.Boolean isPreemptible) {
    this.isPreemptible = isPreemptible;
    return this;
  }

  /**
   * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI,
   * or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the
   * Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-
   * clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the
   * machine type resource, for example, n1-standard-2.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineTypeUri() {
    return machineTypeUri;
  }

  /**
   * Optional. The Compute Engine machine type used for cluster instances.A full URL, partial URI,
   * or short name are valid. Examples:
   * https://www.googleapis.com/compute/v1/projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 projects/[project_id]/zones/us-
   * east1-a/machineTypes/n1-standard-2 n1-standard-2Auto Zone Exception: If you are using the
   * Dataproc Auto Zone Placement (https://cloud.google.com/dataproc/docs/concepts/configuring-
   * clusters/auto-zone#using_auto_zone_placement) feature, you must use the short name of the
   * machine type resource, for example, n1-standard-2.
   * @param machineTypeUri machineTypeUri or {@code null} for none
   */
  public InstanceGroupConfig setMachineTypeUri(java.lang.String machineTypeUri) {
    this.machineTypeUri = machineTypeUri;
    return this;
  }

  /**
   * Output only. The config for Compute Engine Instance Group Manager that manages this group. This
   * is only used for preemptible instance groups.
   * @return value or {@code null} for none
   */
  public ManagedGroupConfig getManagedGroupConfig() {
    return managedGroupConfig;
  }

  /**
   * Output only. The config for Compute Engine Instance Group Manager that manages this group. This
   * is only used for preemptible instance groups.
   * @param managedGroupConfig managedGroupConfig or {@code null} for none
   */
  public InstanceGroupConfig setManagedGroupConfig(ManagedGroupConfig managedGroupConfig) {
    this.managedGroupConfig = managedGroupConfig;
    return this;
  }

  /**
   * Optional. Specifies the minimum cpu platform for the Instance Group. See Dataproc -> Minimum
   * CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
   * @return value or {@code null} for none
   */
  public java.lang.String getMinCpuPlatform() {
    return minCpuPlatform;
  }

  /**
   * Optional. Specifies the minimum cpu platform for the Instance Group. See Dataproc -> Minimum
   * CPU Platform (https://cloud.google.com/dataproc/docs/concepts/compute/dataproc-min-cpu).
   * @param minCpuPlatform minCpuPlatform or {@code null} for none
   */
  public InstanceGroupConfig setMinCpuPlatform(java.lang.String minCpuPlatform) {
    this.minCpuPlatform = minCpuPlatform;
    return this;
  }

  /**
   * Optional. The number of VM instances in the instance group. For master instance groups, must be
   * set to 1.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumInstances() {
    return numInstances;
  }

  /**
   * Optional. The number of VM instances in the instance group. For master instance groups, must be
   * set to 1.
   * @param numInstances numInstances or {@code null} for none
   */
  public InstanceGroupConfig setNumInstances(java.lang.Integer numInstances) {
    this.numInstances = numInstances;
    return this;
  }

  /**
   * Optional. Specifies the preemptibility of the instance group.The default value for master and
   * worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for
   * secondary instances is PREEMPTIBLE.
   * @return value or {@code null} for none
   */
  public java.lang.String getPreemptibility() {
    return preemptibility;
  }

  /**
   * Optional. Specifies the preemptibility of the instance group.The default value for master and
   * worker groups is NON_PREEMPTIBLE. This default cannot be changed.The default value for
   * secondary instances is PREEMPTIBLE.
   * @param preemptibility preemptibility or {@code null} for none
   */
  public InstanceGroupConfig setPreemptibility(java.lang.String preemptibility) {
    this.preemptibility = preemptibility;
    return this;
  }

  @Override
  public InstanceGroupConfig set(String fieldName, Object value) {
    return (InstanceGroupConfig) super.set(fieldName, value);
  }

  @Override
  public InstanceGroupConfig clone() {
    return (InstanceGroupConfig) super.clone();
  }

}
