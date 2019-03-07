package com.github.mauricioaniche.ck.metric;

import com.github.mauricioaniche.ck.CKNumber;
import org.eclipse.jdt.core.dom.CompilationUnit;

public interface ClassLevelMetric {
	void execute(CompilationUnit cu, CKNumber result);
	void setResult(CKNumber result);
}