## 2025-01-24 - JSF Accessibility and Reliability Patterns
**Learning:** Legacy JSF applications often suffer from broken UI logic (incorrect EL variable references, nested forms) that prevent UX improvements from being functional. Additionally, using HTML5 attributes like 'aria-label' in JSF requires explicit namespace declaration (xmlns:a="http://xmlns.jcp.org/jsf/passthrough").
**Action:** Always verify the EL variable names in data tables against the 'var' attribute. Ensure the passthrough namespace is declared when adding ARIA labels to standard JSF/PrimeFaces components.
