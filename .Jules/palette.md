## 2026-06-19 - Legacy JSF Syntax and Structural Issues
**Learning:** Legacy JSF/PrimeFaces applications may contain invalid syntax like `<h.form>` (with a dot instead of colon) and nested forms, which break the JSF lifecycle and prevent interactive elements from functioning correctly.
**Action:** Always verify JSF tag names and ensure forms are not nested to maintain functional interactive elements and predictable UI behavior.

## 2026-06-19 - Form Accessibility and Feedback in PrimeFaces
**Learning:** Missing associations between `p:outputLabel` and inputs (via `for` and `id`) makes forms inaccessible. Additionally, a lack of inline validation feedback (`p:message`) leads to a frustrating user experience when form submissions fail silently.
**Action:** Use the `for` attribute on labels and `id` on inputs to create explicit accessibility associations, and always include `p:message` with `required="true"` for immediate user feedback.
