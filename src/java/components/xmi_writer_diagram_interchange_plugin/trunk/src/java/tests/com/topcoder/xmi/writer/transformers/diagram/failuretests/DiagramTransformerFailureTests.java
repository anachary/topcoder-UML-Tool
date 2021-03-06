/*
 * Copyright (C) 2006 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.xmi.writer.transformers.diagram.failuretests;

import com.topcoder.diagraminterchange.Diagram;
import com.topcoder.xmi.writer.transformers.diagram.elementtransformers.DiagramTransformer;


/**
 * <p>
 * Failure tests for class DiagramTransformer. Tests the exceptions in invalid condition.
 * </p>
 *
 * @author magicpig
 * @version 1.0
 */
public class DiagramTransformerFailureTests extends TransformerFailureBase {
    /**
     * Sets up testing environment.
     *
     * @throws Exception when error occurs
     */
    protected void setUp() throws Exception {
        super.setUp();
        element = new Diagram();
        suhClassName = "DiagramTransformerFailureTests";
        this.instance = new DiagramTransformer();
    }
}
