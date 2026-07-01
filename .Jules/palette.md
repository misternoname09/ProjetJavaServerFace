## 2026-07-01 - Fix functional bugs alongside UX improvements
**Learning:** In legacy JSF projects, UI components often fail due to simple functional bugs (like variable name mismatches or incorrect casing in EL expressions). Improving UX without fixing these functional blockers results in a still-broken interface.
**Action:** Always verify backend method names and variable bindings (e.g., 'var' attribute in data tables) before applying UX enhancements to ensure the improvements are actually functional.

## 2026-07-01 - Standardize form layouts with panelGrid
**Learning:** Using 'h:panelGrid columns="3"' provides a consistent and accessible layout for labels, inputs, and validation messages, which is more robust than manual spacing or line breaks.
**Action:** Default to 'panelGrid' for forms to ensure proper alignment and easier integration of 'p:message' components.
