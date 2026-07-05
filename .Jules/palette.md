## 2026-07-05 - [JSF/PrimeFaces Form Accessibility & Validation]
**Learning:** In legacy JSF projects, functional bugs (like nested forms or incorrect EL casing) often block UX. Combining structural fixes (independent forms, panelGrid) with accessibility (ARIA labels) and immediate feedback (p:message) creates a significantly more robust user experience.
**Action:** Always verify backend method casing (e.g., PascalCase vs camelCase) in Java source files when fixing JSF EL expressions, and ensure forms are not nested to maintain functional integrity.
