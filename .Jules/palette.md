# Palette's Journal - Critical UX & Accessibility Learnings

## 2026-07-12 - Fix Structural and Logic errors in JSF forms
**Learning:** Legacy JSF/PrimeFaces applications often suffer from nested `<h:form>` tags and variable binding mismatches (e.g., `var="e"` but using `#{et.id}`) which silently break the UI and prevent data from rendering. Additionally, JSF EL is case-sensitive, and backend methods might use non-standard PascalCase (e.g., `AddEtudiant`).
**Action:** Always audit the form structure for nesting, verify EL variable consistency, and confirm method casing in Java beans before applying UX enhancements.
