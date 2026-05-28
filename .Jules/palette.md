## 2025-05-14 - Contextual ARIA labels in JSF DataTables
**Learning:** In list views (like `p:dataTable`), generic action buttons (Modifier, Supprimer) lack context for screen reader users. Using the passthrough namespace allows adding dynamic ARIA labels that include entity-specific information.
**Action:** Always use `a:aria-label` with EL expressions (e.g., `a:aria-label="Modifier l'étudiant #{e.nom}"`) for repetitive action components in tables.
