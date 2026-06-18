## 2026-06-18 - JSF Form Layout and Validation
**Learning:** Use 'h:panelGrid columns="3"' in JSF/PrimeFaces forms to cleanly align labels, inputs, and validation messages ('p:message') in a three-column layout.
**Action:** Always pair 'p:outputLabel' with its corresponding input using 'for' and 'id' attributes, and include a 'p:message' for immediate user feedback.

## 2026-06-18 - JSF Accessibility for Row Actions
**Learning:** In 'p:dataTable', row actions like 'Modifier' or 'Supprimer' need unique accessible names to be distinguishable by screen readers.
**Action:** Use 'a:aria-label' with EL expressions (e.g., 'Modifier l\'étudiant #{e.nom}') to provide context for interactive elements within table rows.
