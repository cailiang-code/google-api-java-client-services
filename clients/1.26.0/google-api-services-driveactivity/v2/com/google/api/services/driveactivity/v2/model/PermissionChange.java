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

package com.google.api.services.driveactivity.v2.model;

/**
 * A change of the permission setting on an item.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive Activity API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PermissionChange extends com.google.api.client.json.GenericJson {

  /**
   * The set of permissions added by this change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Permission> addedPermissions;

  /**
   * The set of permissions removed by this change.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Permission> removedPermissions;

  /**
   * The set of permissions added by this change.
   * @return value or {@code null} for none
   */
  public java.util.List<Permission> getAddedPermissions() {
    return addedPermissions;
  }

  /**
   * The set of permissions added by this change.
   * @param addedPermissions addedPermissions or {@code null} for none
   */
  public PermissionChange setAddedPermissions(java.util.List<Permission> addedPermissions) {
    this.addedPermissions = addedPermissions;
    return this;
  }

  /**
   * The set of permissions removed by this change.
   * @return value or {@code null} for none
   */
  public java.util.List<Permission> getRemovedPermissions() {
    return removedPermissions;
  }

  /**
   * The set of permissions removed by this change.
   * @param removedPermissions removedPermissions or {@code null} for none
   */
  public PermissionChange setRemovedPermissions(java.util.List<Permission> removedPermissions) {
    this.removedPermissions = removedPermissions;
    return this;
  }

  @Override
  public PermissionChange set(String fieldName, Object value) {
    return (PermissionChange) super.set(fieldName, value);
  }

  @Override
  public PermissionChange clone() {
    return (PermissionChange) super.clone();
  }

}
