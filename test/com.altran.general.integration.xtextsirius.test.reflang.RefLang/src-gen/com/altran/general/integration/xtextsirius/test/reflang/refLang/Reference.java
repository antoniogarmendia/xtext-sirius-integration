/**
 * generated by Xtext 2.14.0
 */
package com.altran.general.integration.xtextsirius.test.reflang.refLang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.altran.general.integration.xtextsirius.test.reflang.refLang.Reference#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(IContainerContent)
   * @see com.altran.general.integration.xtextsirius.test.reflang.refLang.RefLangPackage#getReference_Target()
   * @model
   * @generated
   */
  IContainerContent getTarget();

  /**
   * Sets the value of the '{@link com.altran.general.integration.xtextsirius.test.reflang.refLang.Reference#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(IContainerContent value);

} // Reference
