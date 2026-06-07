## 2025-05-15 - JSF EL Case Sensitivity & Naming Conventions
**Learning:** JSF EL method expressions are case-sensitive. In this legacy project, naming conventions are inconsistent (e.g., `AddEtudiant` starts with an uppercase letter while `deleteEtudiant` starts with lowercase).
**Action:** Always verify the exact method name in the Java Managed Bean before referencing it in XHTML to avoid `MethodNotFoundException`.

## 2025-05-15 - Refactoring Legacy XHTML
**Learning:** Legacy XHTML files often contain invalid nested forms and dot-notation for tags (e.g., `<h.form>`), which break the JSF lifecycle.
**Action:** Replace dot-notation with colon-notation and ensure forms are not nested. Use `h:panelGrid` with `p:message` for consistent, accessible form layouts.
