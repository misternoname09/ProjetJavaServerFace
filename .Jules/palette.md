## 2025-05-14 - JSF Accessibility and Usability Patterns
**Learning:** JSF applications often suffer from disconnected labels and invalid form nesting. Specifically, `p:outputLabel` requires explicit `for` and `id` mapping, and `h:commandButton` must be inside an `h:form`.
**Action:** Always verify `for`/`id` mapping for accessibility and ensure interactive elements are properly wrapped in forms. Check data table iteration variables against the 'var' attribute.
