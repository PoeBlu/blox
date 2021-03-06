/*
 * Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may
 * not use this file except in compliance with the License. A copy of the
 * License is located at
 *
 *     http://aws.amazon.com/apache2.0/
 *
 * or in the "LICENSE" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.blox.frontend.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
// required for builder
@AllArgsConstructor
// required for mapstruct
@NoArgsConstructor
public final class Environment {
  private String environmentName;
  private String cluster;
  private String role;
  private String environmentType;
  private String environmentHealth;
  private String deploymentMethod;
  private DeploymentConfiguration deploymentConfiguration;
  private String activeEnvironmentRevisionId;
  private String latestEnvironmentRevisionId;
}
