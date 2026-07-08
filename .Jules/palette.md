## 2026-07-08 - [Case-sensitive JSF EL Method References]
**Learning:** JSF Expression Language (EL) is strictly case-sensitive for method references. Even if most methods in a project follow camelCase, some legacy code might use PascalCase (e.g., 'AddEtudiant' instead of 'addEtudiant'). Changing the casing in the view to match what is perceived as "standard" without verifying the Java source can break functionality.
**Action:** Always verify the exact method name and casing in the Java backing bean before updating EL expressions in XHTML files.

## 2026-07-08 - [JSF Form Nesting and Command Component Visibility]
**Learning:** JSF does not support nested '<h:form>' tags, and command components (like 'h:commandButton') will not execute their actions if they are not enclosed within a valid form. Additionally, invalid tags like '<h.form>' (using a dot instead of a colon) are ignored by the JSF renderer, potentially leaving components orphaned from a form.
**Action:** Ensure all interactive components are wrapped in a single, non-nested '<h:form>' and use correct colon-separated namespace syntax for JSF tags.
