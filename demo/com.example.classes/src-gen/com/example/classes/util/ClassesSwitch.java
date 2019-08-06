/**
 * generated by Xtext 2.18.0.M3
 */
package com.example.classes.util;

import com.example.classes.Association;
import com.example.classes.Attribute;
import com.example.classes.BuiltInType;
import com.example.classes.ClassModel;
import com.example.classes.ClassRef;
import com.example.classes.ClassesPackage;
import com.example.classes.Constant;
import com.example.classes.ConstantRef;
import com.example.classes.Content;
import com.example.classes.Description;
import com.example.classes.IntegerLiteral;
import com.example.classes.IntegerType;
import com.example.classes.StringType;
import com.example.classes.Type;
import com.example.classes.Value;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.example.classes.ClassesPackage
 * @generated
 */
public class ClassesSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static ClassesPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ClassesSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = ClassesPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case ClassesPackage.CLASS_MODEL:
      {
        ClassModel classModel = (ClassModel)theEObject;
        T result = caseClassModel(classModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.CONTENT:
      {
        Content content = (Content)theEObject;
        T result = caseContent(content);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.CONSTANT:
      {
        Constant constant = (Constant)theEObject;
        T result = caseConstant(constant);
        if (result == null) result = caseContent(constant);
        if (result == null) result = caseDescription(constant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.ASSOCIATION:
      {
        Association association = (Association)theEObject;
        T result = caseAssociation(association);
        if (result == null) result = caseContent(association);
        if (result == null) result = caseDescription(association);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.CLASS:
      {
        com.example.classes.Class class_ = (com.example.classes.Class)theEObject;
        T result = caseClass(class_);
        if (result == null) result = caseContent(class_);
        if (result == null) result = caseDescription(class_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.ATTRIBUTE:
      {
        Attribute attribute = (Attribute)theEObject;
        T result = caseAttribute(attribute);
        if (result == null) result = caseDescription(attribute);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.BUILT_IN_TYPE:
      {
        BuiltInType builtInType = (BuiltInType)theEObject;
        T result = caseBuiltInType(builtInType);
        if (result == null) result = caseType(builtInType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.STRING_TYPE:
      {
        StringType stringType = (StringType)theEObject;
        T result = caseStringType(stringType);
        if (result == null) result = caseBuiltInType(stringType);
        if (result == null) result = caseType(stringType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.INTEGER_TYPE:
      {
        IntegerType integerType = (IntegerType)theEObject;
        T result = caseIntegerType(integerType);
        if (result == null) result = caseBuiltInType(integerType);
        if (result == null) result = caseType(integerType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.CLASS_REF:
      {
        ClassRef classRef = (ClassRef)theEObject;
        T result = caseClassRef(classRef);
        if (result == null) result = caseType(classRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.VALUE:
      {
        Value value = (Value)theEObject;
        T result = caseValue(value);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = caseValue(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.CONSTANT_REF:
      {
        ConstantRef constantRef = (ConstantRef)theEObject;
        T result = caseConstantRef(constantRef);
        if (result == null) result = caseValue(constantRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case ClassesPackage.DESCRIPTION:
      {
        Description description = (Description)theEObject;
        T result = caseDescription(description);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassModel(ClassModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Content</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContent(Content object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstant(Constant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Association</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssociation(Association object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClass(com.example.classes.Class object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttribute(Attribute object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Built In Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Built In Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBuiltInType(BuiltInType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringType(StringType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerType(IntegerType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Class Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Class Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClassRef(ClassRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseValue(Value object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constant Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constant Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstantRef(ConstantRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Description</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescription(Description object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //ClassesSwitch
