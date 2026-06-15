## 2026-06-15 - Enhancing Legacy JSF/PrimeFaces Forms
**Learning:** Legacy JSF code often contains nested forms or missing form wrappers, which breaks PrimeFaces component functionality and accessibility. Linking `p:outputLabel` with `for` and adding `p:message` in a `p:panelGrid` (columns="3") is a robust pattern for accessible, user-friendly forms.
**Action:** Always check for nested `<h:form>` tags and ensure all interactive elements are in a valid form. Use the 3-column layout for labels, inputs, and validation messages to improve visual alignment and accessibility.
