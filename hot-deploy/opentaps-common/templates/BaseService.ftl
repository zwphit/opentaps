package org.opentaps.base.services;

/*
 * Copyright (c) 2009 - 2009 Open Source Strategies, Inc.
 *
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
 */

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE SERVICE MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import org.opentaps.foundation.service.ServiceWrapper;

<#-- imports for all the fields' types -->
<#list types as type>
import ${type};
</#list>

/**
 * ${serviceDescription}.
 * Auto generated base service entity ${name}.
 *
 * Engine: ${serviceEngine}
 * Location: ${serviceLocation}
 * Invoke: ${serviceInvoke}
 * Defined in: ${serviceDefinition}
 */
public class ${className} extends ServiceWrapper {

    /** The service name as used by the service engine. */
    public static final String NAME = "${name}";
    /** If the service requires authentication. */
    public static final Boolean REQUIRES_AUTHENTICATION = Boolean.${requiresAuth?string("TRUE", "FALSE")};
    /** If the service requires a new transaction. */
    public static final Boolean REQUIRES_NEW_TRANSACTION = Boolean.${requiresNewTransaction?string("TRUE", "FALSE")};
    /** If the service uses a transaction. */
    public static final Boolean USES_TRANSACTION = Boolean.${usesTransaction?string("TRUE", "FALSE")};

    /** The enumeration of input parameters. */
    public static enum In {
      <#list inParams.keySet() as field>
        <#assign p = inParams.get(field) />
        ${paramNames.get(field)}("${p.name}")<#if field_has_next>,<#else>;</#if>
      </#list>
        private final String _fieldName;
        private In(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    public static enum Out {
      <#list outParams.keySet() as field>
        <#assign p = outParams.get(field) />
        ${paramNames.get(field)}("${p.name}")<#if field_has_next>,<#else>;</#if>
      </#list>
        private final String _fieldName;
        private Out(String name) { this._fieldName = name; }
        public String getName() { return this._fieldName; }
    }

    /**
     * Creates a new <code>${className}</code> instance.
     */
    public ${className}() {
        super();
    }

    <#if requiresAuth>
    /**
     * Creates a new <code>${className}</code> instance.
     * @param user an <code>User</code> value
     */
    public ${className}(User user) {
        super(user);
    }
    </#if>

  <#list inFieldNames.keySet() as field>
    private ${fieldTypes.get(field)} ${inFieldNames.get(field)};
  </#list>
  <#list outFieldNames.keySet() as field>
    private ${fieldTypes.get(field)} ${outFieldNames.get(field)};
  </#list>

    private Set<String> inParameters = FastSet.newInstance();
    private Set<String> outParameters = FastSet.newInstance();

  <#-- get methods -->
  <#list inGetMethodNames.keySet() as field>
    <#assign p = inParams.get(field) />
    /**
     * Auto generated value accessor.
     * This parameter is ${p.isOptional()?string("optional", "required")}.<#if fieldRealTypes.get(field)?has_content>
     * The real type is: <code>${fieldRealTypes.get(field)}</code>.</#if>
     * @return <code>${fieldTypes.get(field)}</code>
     */
    public ${fieldTypes.get(field)} ${inGetMethodNames.get(field)}() {
        return this.${inFieldNames.get(field)};
    }
  </#list>
  <#list outGetMethodNames.keySet() as field>
    <#assign p = outParams.get(field) />
    /**
     * Auto generated value accessor.
     * This parameter is ${p.isOptional()?string("optional", "required")}.<#if fieldRealTypes.get(field)?has_content>
     * The real type is: <code>${fieldRealTypes.get(field)}</code>.</#if>
     * @return <code>${fieldTypes.get(field)}</code>
     */
    public ${fieldTypes.get(field)} ${outGetMethodNames.get(field)}() {
        return this.${outFieldNames.get(field)};
    }
  </#list>

  <#-- set methods -->
  <#list inSetMethodNames.keySet() as field>
    <#assign p = inParams.get(field) />
    /**
     * Auto generated value setter.
     * This parameter is ${p.isOptional()?string("optional", "required")}.<#if fieldRealTypes.get(field)?has_content>
     * The real type is: <code>${fieldRealTypes.get(field)}</code>.</#if>
     * @param ${inFieldNames.get(field)} the ${inFieldNames.get(field)} to set
    */
    public void ${inSetMethodNames.get(field)}(${fieldTypes.get(field)} ${inFieldNames.get(field)}) {
        this.inParameters.add("${field}");
        this.${inFieldNames.get(field)} = ${inFieldNames.get(field)};
    }
  </#list>
  <#list outSetMethodNames.keySet() as field>
    <#assign p = outParams.get(field) />
    /**
     * Auto generated value setter.
     * This parameter is ${p.isOptional()?string("optional", "required")}.<#if fieldRealTypes.get(field)?has_content>
     * The real type is: <code>${fieldRealTypes.get(field)}</code>.</#if>
     * @param ${outFieldNames.get(field)} the ${outFieldNames.get(field)} to set
    */
    public void ${outSetMethodNames.get(field)}(${fieldTypes.get(field)} ${outFieldNames.get(field)}) {
        this.outParameters.add("${field}");
        this.${outFieldNames.get(field)} = ${outFieldNames.get(field)};
    }
  </#list>

    <#-- some other instance methods -->
    /** {@inheritDoc} */
    public String name() {
        return NAME;
    }

    /** {@inheritDoc} */
    public Boolean requiresAuthentication() {
        return REQUIRES_AUTHENTICATION;
    }

    /** {@inheritDoc} */
    public Boolean requiresNewTransaction() {
        return REQUIRES_NEW_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Boolean usesTransaction() {
        return USES_TRANSACTION;
    }

    /** {@inheritDoc} */
    public Map<String, Object> inputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        <#list inParams.keySet() as field>
        if (inParameters.contains("${field}")) mapValue.put("${field}", ${inGetMethodNames.get(field)}());
        </#list>
        // allow the User set to override the userLogin
        if (getUser() != null) mapValue.put("userLogin", getUser().getOfbizUserLogin());
        return mapValue;
    }

    /** {@inheritDoc} */
    public Map<String, Object> outputMap() {
        Map<String, Object> mapValue = new FastMap<String, Object>();
        <#list outParams.keySet() as field>
        if (outParameters.contains("${field}")) mapValue.put("${field}", ${outGetMethodNames.get(field)}());
        </#list>
        return mapValue;
    }

    /** {@inheritDoc} */
    public void putAllInput(Map<String, Object> mapValue) {
        <#list inParams.keySet() as field>
        if (mapValue.containsKey("${field}")) ${inSetMethodNames.get(field)}((${fieldTypes.get(field)}) mapValue.get("${field}"));
        </#list>
    }

    /** {@inheritDoc} */
    public void putAllOutput(Map<String, Object> mapValue) {
        <#list outParams.keySet() as field>
        if (mapValue.containsKey("${field}")) ${outSetMethodNames.get(field)}((${fieldTypes.get(field)}) mapValue.get("${field}"));
        </#list>
    }

    /**
     * Construct a <code>${className}</code> from the input values of the given <code>${className}</code>.
     * @param input a <code>${className}</code>
     */
    public static ${className} fromInput(${className} input) {
        ${className} service = new ${className}();
        return fromInput(input.inputMap());
    }

    /**
     * Construct a <code>${className}</code> from the output values of the given <code>${className}</code>.
     * @param output a <code>${className}</code>
     */
    public static ${className} fromOutput(${className} output) {
        ${className} service = new ${className}();
        service.putAllOutput(output.outputMap());
        return service;
    }

    /**
     * Construct a <code>${className}</code> from the given input <code>Map</code>.
     * @param mapValue the service input <code>Map</code>
     */
    public static ${className} fromInput(Map<String, Object> mapValue) {
        ${className} service = new ${className}();
        service.putAllInput(mapValue);
        if (mapValue.containsKey("userLogin")) {
            GenericValue userGv = (GenericValue) mapValue.get("userLogin");
            if (userGv != null) {
                service.setUser(new User(userGv, userGv.getDelegator()));
            }
        }
        return service;
    }

    /**
     * Construct a <code>${className}</code> from the given output <code>Map</code>.
     * @param mapValue the service output <code>Map</code>
     */
    public static ${className} fromOutput(Map<String, Object> mapValue) {
        ${className} service = new ${className}();
        service.putAllOutput(mapValue);
        return service;
    }
}
