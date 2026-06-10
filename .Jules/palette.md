## 2025-05-14 - UX and Accessibility Improvements in Legacy JSF

**Learning:** In legacy JSF applications using PrimeFaces, the following patterns significantly improve UX and accessibility:
1. Use `p:panelGrid columns="3"` to cleanly align `p:outputLabel`, `p:inputText`, and `p:message` for inline validation.
2. Always use `for` and `id` attributes to associate labels with inputs for screen readers.
3. Use the JSF passthrough namespace (`xmlns:a="http://xmlns.jcp.org/jsf/passthrough"`) to add `a:aria-label` and `a:placeholder` to JSF components.
4. Use `<f:convertDateTime pattern="dd/MM/yyyy" />` for consistent, human-readable date formatting.
5. In `p:dataTable`, ensure the iteration variable is consistently used (e.g., `var="e"` and `#{e.property}`).

**Action:** Apply these patterns consistently when modernizing or improving legacy JSF/PrimeFaces interfaces. Pay special attention to case-sensitivity in EL expressions (e.g., method names) and property names.
