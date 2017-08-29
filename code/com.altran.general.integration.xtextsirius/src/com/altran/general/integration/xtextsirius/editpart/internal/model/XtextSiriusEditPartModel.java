package com.altran.general.integration.xtextsirius.editpart.internal.model;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gef.tools.DirectEditManager;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.eclipse.sirius.viewpoint.DSemanticDecorator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.serializer.ISerializer;

import com.altran.general.integration.xtextsirius.editpart.internal.AXtextSiriusEditPart;

public class XtextSiriusEditPartModel extends AXtextSiriusEditPart implements IXtextAwareEditPartModel {
	
	public XtextSiriusEditPartModel(final @NonNull EditPartDescriptorModel descriptor, final @NonNull View view) {
		super(descriptor, view);
	}
	
	@Override
	public @NonNull String getEditText() {
		return StringUtils.normalizeSpace(getInjector().getInstance(ISerializer.class).serialize(getSemanticElement()));
		// final INode node = getSemanticNode();
		// if (node != null) {
		// final String text = node.getText();
		// return StringUtils.normalizeSpace(text);
		// }
		//
		// return "(empty)";
	}

	protected @Nullable INode getSemanticNode() {
		final EObject semanticElement = getSemanticElement();
		if (semanticElement == null) {
			return null;
		}
		
		return NodeModelUtils.getNode(semanticElement);
	}

	@Override
	public EObject getSemanticElement() {
		return ((DSemanticDecorator) resolveSemanticElement()).getTarget();
	}
	
	@Override
	protected @NonNull DirectEditManager createDirectEditManager() {
		return new XtextSiriusDirectEditManagerModel(this, this.getInjector(),
				translateToStyle(), isMultiLine());
	}
	
	@Override
	protected void setContext(final Resource res) {
		// TODO Auto-generated method stub

	}
}
