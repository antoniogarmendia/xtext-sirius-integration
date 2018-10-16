/*
 * generated by Xtext 2.12.0
 */
package com.example.classes.ide.contentassist.antlr;

import com.example.classes.ide.contentassist.antlr.internal.InternalInlineeditParser;
import com.example.classes.services.InlineeditGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class InlineeditParser extends AbstractContentAssistParser {

	@Inject
	private InlineeditGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalInlineeditParser createParser() {
		InternalInlineeditParser result = new InternalInlineeditParser(null);
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
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
					put(grammarAccess.getClassAccess().getGroup(), "rule__Class__Group__0");
					put(grammarAccess.getAttributeAccess().getGroup(), "rule__Attribute__Group__0");
					put(grammarAccess.getStringTypeAccess().getGroup(), "rule__StringType__Group__0");
					put(grammarAccess.getIntegerTypeAccess().getGroup(), "rule__IntegerType__Group__0");
					put(grammarAccess.getAssociationAccess().getNameAssignment_2(), "rule__Association__NameAssignment_2");
					put(grammarAccess.getAssociationAccess().getLowerBoundAssignment_4(), "rule__Association__LowerBoundAssignment_4");
					put(grammarAccess.getAssociationAccess().getUpperBoundAssignment_6(), "rule__Association__UpperBoundAssignment_6");
					put(grammarAccess.getAssociationAccess().getSourceAssignment_8(), "rule__Association__SourceAssignment_8");
					put(grammarAccess.getAssociationAccess().getTargetAssignment_10(), "rule__Association__TargetAssignment_10");
					put(grammarAccess.getClassModelAccess().getContentAssignment(), "rule__ClassModel__ContentAssignment");
					put(grammarAccess.getConstantAccess().getNameAssignment_2(), "rule__Constant__NameAssignment_2");
					put(grammarAccess.getConstantAccess().getInitialAssignment_4(), "rule__Constant__InitialAssignment_4");
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

	public InlineeditGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(InlineeditGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
