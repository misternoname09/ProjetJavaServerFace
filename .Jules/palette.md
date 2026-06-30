## 2026-06-30 - Legacy JSF Form and Accessibility Fixes
**Learning:** Legacy JSF applications often contain structural errors (like nested forms or invalid dot-notated tags) that silently break functionality. Additionally, accessibility features like ARIA labels for row actions and proper label-input associations are frequently missing in these older codebases.
**Action:** When working with PrimeFaces/JSF:
1. Ensure `h:form` tags are not nested.
2. Use `p:outputLabel` with `for` matching the input `id`.
3. Add `a:aria-label` to row-level action links/buttons using EL to provide context (e.g., student name).
4. Use `p:message` with `required="true"` for immediate validation feedback.
