/*
 * generated by Xtext 2.12.0
 */
package com.example.ide.contentassist.antlr;

import com.example.ide.contentassist.antlr.internal.InternalClassesParser;
import com.example.services.ClassesGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ClassesParser extends AbstractContentAssistParser {

	@Inject
	private ClassesGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalClassesParser createParser() {
		InternalClassesParser result = new InternalClassesParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getContentAccess().getAlternatives(), "rule__Content__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getBuiltInTypeAccess().getAlternatives(), "rule__BuiltInType__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getVisibilityAccess().getAlternatives(), "rule__Visibility__Alternatives");
					put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getStringTypeAccess().getGroup(), "rule__StringType__Group__0");
					put(grammarAccess.getIntegerTypeAccess().getGroup(), "rule__IntegerType__Group__0");
					put(grammarAccess.getClassModelAccess().getContentAssignment(), "rule__ClassModel__ContentAssignment");
					put(grammarAccess.getConstantAccess().getNameAssignment_2(), "rule__Constant__NameAssignment_2");
					put(grammarAccess.getConstantAccess().getInitialAssignment_4(), "rule__Constant__InitialAssignment_4");
					put(grammarAccess.getAssociationAccess().getNameAssignment_2(), "rule__Association__NameAssignment_2");
					put(grammarAccess.getAssociationAccess().getSourceAssignment_3(), "rule__Association__SourceAssignment_3");
					put(grammarAccess.getAssociationAccess().getTargetAssignment_5(), "rule__Association__TargetAssignment_5");
					put(grammarAccess.getAssociationAccess().getLowerBoundAssignment_7(), "rule__Association__LowerBoundAssignment_7");
					put(grammarAccess.getAssociationAccess().getUpperBoundAssignment_9(), "rule__Association__UpperBoundAssignment_9");
					put(grammarAccess.getClassAccess().getNameAssignment_2(), "rule__Class__NameAssignment_2");
					put(grammarAccess.getClassAccess().getAttributesAssignment_4(), "rule__Class__AttributesAssignment_4");
					put(grammarAccess.getAttributeAccess().getVisibilityAssignment_1(), "rule__Attribute__VisibilityAssignment_1");
					put(grammarAccess.getAttributeAccess().getNameAssignment_2(), "rule__Attribute__NameAssignment_2");
					put(grammarAccess.getAttributeAccess().getTypeAssignment_4(), "rule__Attribute__TypeAssignment_4");
					put(grammarAccess.getAttributeAccess().getLowerBoundAssignment_6(), "rule__Attribute__LowerBoundAssignment_6");
					put(grammarAccess.getAttributeAccess().getUpperBoundAssignment_8(), "rule__Attribute__UpperBoundAssignment_8");
					put(grammarAccess.getClassRefAccess().getTargetAssignment(), "rule__ClassRef__TargetAssignment");
					put(grammarAccess.getIntegerLiteralAccess().getValueAssignment(), "rule__IntegerLiteral__ValueAssignment");
					put(grammarAccess.getConstantRefAccess().getTargetAssignment(), "rule__ConstantRef__TargetAssignment");
					put(grammarAccess.getDescriptionAccess().getDescriptionAssignment(), "rule__Description__DescriptionAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ClassesGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ClassesGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}