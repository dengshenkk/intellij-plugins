package com.intellij.lang.javascript;

import com.intellij.codeInspection.LocalInspectionTool;
import com.intellij.lang.javascript.inspections.actionscript.JSFieldCanBeLocalInspection;
import org.jetbrains.annotations.NonNls;

public class FlexConvertToLocalTest extends BaseJSIntentionTestCase {
  @Override
  protected LocalInspectionTool[] configureLocalInspectionTools() {
    return new LocalInspectionTool[]{new JSFieldCanBeLocalInspection()};
  }

  @Override
  @NonNls
  public String getBasePath() {
    return "/highlighting/intention/convertToLocal";
  }

  @Override
  public String getTestDataPath() {
    return JSTestUtils.getTestDataPath();
  }

  @JSTestOptions({JSTestOption.WithFlexFacet, JSTestOption.WithGumboSdk})
  public void testAll() throws Exception {
    doTestAll();
  }
}

