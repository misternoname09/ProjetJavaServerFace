## 2025-05-14 - [Legacy JSF UX Improvements]
**Learning:** In legacy JSF projects, structural syntax errors like `<h.form>` (instead of `<h:form>`) and incorrect EL property mappings can completely break data rendering and form submissions. Accessibility is often overlooked, with missing input-label associations and no context for screen readers on row actions.
**Action:** Always verify JSF tag syntax and match EL expressions exactly with Java Bean property names. Use PrimeFaces 'a:aria-label' passthrough for row-specific actions in data tables.
