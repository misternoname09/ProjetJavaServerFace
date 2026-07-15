## 2026-07-14 - [Accessibility] JSF Passthrough and Label Association
**Learning:** JSF/PrimeFaces components require 'xmlns:a="http://xmlns.jcp.org/jsf/passthrough"' to support standard HTML5 attributes like 'aria-label' and 'placeholder'. Proper accessibility in PrimeFaces forms is achieved by using 'p:outputLabel' with a 'for' attribute matching the 'id' of the input component.
**Action:** Always include the passthrough namespace and use explicit label association in all JSF views.
