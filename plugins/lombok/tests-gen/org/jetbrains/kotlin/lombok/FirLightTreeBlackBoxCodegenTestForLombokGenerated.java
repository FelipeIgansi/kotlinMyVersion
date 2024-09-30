/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.lombok;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.kotlin.test.TargetBackend;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/lombok/testData/box")
@TestDataPath("$PROJECT_ROOT")
public class FirLightTreeBlackBoxCodegenTestForLombokGenerated extends AbstractFirLightTreeBlackBoxCodegenTestForLombok {
  @Test
  @TestMetadata("accessorsStripPrefix.kt")
  public void testAccessorsStripPrefix() {
    runTest("plugins/lombok/testData/box/accessorsStripPrefix.kt");
  }

  @Test
  @TestMetadata("accessorsStripPrefixConfig.kt")
  public void testAccessorsStripPrefixConfig() {
    runTest("plugins/lombok/testData/box/accessorsStripPrefixConfig.kt");
  }

  @Test
  @TestMetadata("allArgsConstructor.kt")
  public void testAllArgsConstructor() {
    runTest("plugins/lombok/testData/box/allArgsConstructor.kt");
  }

  @Test
  @TestMetadata("allArgsConstructorInference.kt")
  public void testAllArgsConstructorInference() {
    runTest("plugins/lombok/testData/box/allArgsConstructorInference.kt");
  }

  @Test
  @TestMetadata("allArgsConstructorStatic.kt")
  public void testAllArgsConstructorStatic() {
    runTest("plugins/lombok/testData/box/allArgsConstructorStatic.kt");
  }

  @Test
  public void testAllFilesPresentInBox() {
    KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/lombok/testData/box"), Pattern.compile("^(.+)\\.kt$"), null, TargetBackend.JVM_IR, true);
  }

  @Test
  @TestMetadata("builder.kt")
  public void testBuilder() {
    runTest("plugins/lombok/testData/box/builder.kt");
  }

  @Test
  @TestMetadata("builderGuava.kt")
  public void testBuilderGuava() {
    runTest("plugins/lombok/testData/box/builderGuava.kt");
  }

  @Test
  @TestMetadata("builderRawSingular.kt")
  public void testBuilderRawSingular() {
    runTest("plugins/lombok/testData/box/builderRawSingular.kt");
  }

  @Test
  @TestMetadata("builderSingular.kt")
  public void testBuilderSingular() {
    runTest("plugins/lombok/testData/box/builderSingular.kt");
  }

  @Test
  @TestMetadata("configAccessors.kt")
  public void testConfigAccessors() {
    runTest("plugins/lombok/testData/box/configAccessors.kt");
  }

  @Test
  @TestMetadata("configAccessorsOverride.kt")
  public void testConfigAccessorsOverride() {
    runTest("plugins/lombok/testData/box/configAccessorsOverride.kt");
  }

  @Test
  @TestMetadata("configCaseInsensitive.kt")
  public void testConfigCaseInsensitive() {
    runTest("plugins/lombok/testData/box/configCaseInsensitive.kt");
  }

  @Test
  @TestMetadata("configSimple.kt")
  public void testConfigSimple() {
    runTest("plugins/lombok/testData/box/configSimple.kt");
  }

  @Test
  @TestMetadata("conflictingGetter.kt")
  public void testConflictingGetter() {
    runTest("plugins/lombok/testData/box/conflictingGetter.kt");
  }

  @Test
  @TestMetadata("data.kt")
  public void testData() {
    runTest("plugins/lombok/testData/box/data.kt");
  }

  @Test
  @TestMetadata("genericsAccessors.kt")
  public void testGenericsAccessors() {
    runTest("plugins/lombok/testData/box/genericsAccessors.kt");
  }

  @Test
  @TestMetadata("genericsConstructors.kt")
  public void testGenericsConstructors() {
    runTest("plugins/lombok/testData/box/genericsConstructors.kt");
  }

  @Test
  @TestMetadata("genericsConstructorsStatic.kt")
  public void testGenericsConstructorsStatic() {
    runTest("plugins/lombok/testData/box/genericsConstructorsStatic.kt");
  }

  @Test
  @TestMetadata("gettersFluent.kt")
  public void testGettersFluent() {
    runTest("plugins/lombok/testData/box/gettersFluent.kt");
  }

  @Test
  @TestMetadata("noArgsConstructor.kt")
  public void testNoArgsConstructor() {
    runTest("plugins/lombok/testData/box/noArgsConstructor.kt");
  }

  @Test
  @TestMetadata("noArgsConstructorStatic.kt")
  public void testNoArgsConstructorStatic() {
    runTest("plugins/lombok/testData/box/noArgsConstructorStatic.kt");
  }

  @Test
  @TestMetadata("nullability.kt")
  public void testNullability() {
    runTest("plugins/lombok/testData/box/nullability.kt");
  }

  @Test
  @TestMetadata("propertyFromSuper.kt")
  public void testPropertyFromSuper() {
    runTest("plugins/lombok/testData/box/propertyFromSuper.kt");
  }

  @Test
  @TestMetadata("requiredArgsConstructor.kt")
  public void testRequiredArgsConstructor() {
    runTest("plugins/lombok/testData/box/requiredArgsConstructor.kt");
  }

  @Test
  @TestMetadata("requiredArgsConstructorStatic.kt")
  public void testRequiredArgsConstructorStatic() {
    runTest("plugins/lombok/testData/box/requiredArgsConstructorStatic.kt");
  }

  @Test
  @TestMetadata("settersVariations.kt")
  public void testSettersVariations() {
    runTest("plugins/lombok/testData/box/settersVariations.kt");
  }

  @Test
  @TestMetadata("simple.kt")
  public void testSimple() {
    runTest("plugins/lombok/testData/box/simple.kt");
  }

  @Test
  @TestMetadata("superBuilder.kt")
  public void testSuperBuilder() {
    runTest("plugins/lombok/testData/box/superBuilder.kt");
  }

  @Test
  @TestMetadata("superBuilderGuava.kt")
  public void testSuperBuilderGuava() {
    runTest("plugins/lombok/testData/box/superBuilderGuava.kt");
  }

  @Test
  @TestMetadata("superBuilderSingular.kt")
  public void testSuperBuilderSingular() {
    runTest("plugins/lombok/testData/box/superBuilderSingular.kt");
  }

  @Test
  @TestMetadata("value.kt")
  public void testValue() {
    runTest("plugins/lombok/testData/box/value.kt");
  }

  @Test
  @TestMetadata("valueFieldAccess.kt")
  public void testValueFieldAccess() {
    runTest("plugins/lombok/testData/box/valueFieldAccess.kt");
  }

  @Test
  @TestMetadata("with.kt")
  public void testWith() {
    runTest("plugins/lombok/testData/box/with.kt");
  }

  @Test
  @TestMetadata("withBooleanField.kt")
  public void testWithBooleanField() {
    runTest("plugins/lombok/testData/box/withBooleanField.kt");
  }
}
