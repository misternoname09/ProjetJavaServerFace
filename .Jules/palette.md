## 2025-05-15 - JSF Form and Data Table Accessibility
**Learning:** Legacy JSF applications often contain syntax errors like `<h.form>` instead of `<h:form>` and broken data table variable bindings (e.g., using `et` instead of `e`). Accessibility is frequently neglected, with missing `for`/`id` associations on labels.
**Action:** Always check JSF components for correct namespace separators, verify `var` attribute consistency in `p:dataTable`, and ensure `p:outputLabel` is explicitly linked to its input component.

## 2025-05-15 - JavaScript in JSF Attributes
**Learning:** Using single quotes in JSF attributes containing JavaScript (like `onclick`) can break if the text also contains single quotes (e.g., French "l'etudiant").
**Action:** Escape single quotes in JavaScript strings within JSF attributes (e.g., `l\'etudiant`).
