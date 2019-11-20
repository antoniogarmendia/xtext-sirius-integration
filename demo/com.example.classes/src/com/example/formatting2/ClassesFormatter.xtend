/*
 * generated by Xtext 2.18.0.M3
 */
package com.example.formatting2

import com.example.classes.ClassModel
import com.example.classes.ClassesPackage
import com.example.classes.Constant
import com.example.services.ClassesGrammarAccess
import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import com.example.classes.Association
import com.example.classes.Attribute

class ClassesFormatter extends AbstractFormatter2 {
	extension ClassesPackage = ClassesPackage::eINSTANCE
	
//	@Inject extension ClassesGrammarAccess

	def dispatch void format(ClassModel classModel, extension IFormattableDocument document) {
		classModel.content.forEach[format]
	}

	def dispatch void format(Constant constant, extension IFormattableDocument document) {
		constant.regionFor.keyword("constant").prepend[newLines = 2]
	}
	
	def dispatch void format(Association assoc, extension IFormattableDocument document) {
		assoc.regionFor.keyword("association").prepend[newLines = 2]
	}
	
	def dispatch void format(com.example.classes.Class clazz, extension IFormattableDocument document) {
		clazz.regionFor.keyword("class").prepend[newLines = 2]
		clazz.regionFor.keyword("{").append[newLine]
		clazz.regionFor.keyword("}").prepend[newLine]
		Pair::of(clazz.regionFor.keyword("{"), clazz.regionFor.keyword("}")).interior[indent]
	}
	
	def dispatch void format(Attribute attr, extension IFormattableDocument document) {
		attr.regionFor.feature(attribute_Visibility).prepend[newLine]
	}
}