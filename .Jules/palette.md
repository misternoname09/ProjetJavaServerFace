## 2025-05-14 - [JSF/PrimeFaces Accessibility and Syntax Patterns]
**Learning:** Legacy JSF applications often have accessibility gaps like unlinked labels and syntax errors like using dot separators instead of colons for tags. French text in JavaScript attributes (like `onclick`) requires careful escaping of single quotes to avoid syntax errors.
**Action:** Always verify label associations using `for` and `id` attributes. Ensure JSF tags use colon separators (e.g., `<h:form>`). Escape single quotes in French text within JavaScript strings.
