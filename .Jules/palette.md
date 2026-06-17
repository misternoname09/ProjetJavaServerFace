## 2026-06-17 - Initial Exploration of Legacy JSF Project
**Learning:** Legacy JSF applications often suffer from non-standard syntax (like `<h.form>`) and broken JavaScript due to unescaped characters in localized strings (e.g., French single quotes). Accessibility is frequently overlooked, with missing ARIA labels on action buttons and disconnected labels.
**Action:** Always verify JSF syntax and escape single quotes in `onclick` handlers. Ensure `p:outputLabel` is correctly mapped to input `id`s using the `for` attribute. Use `a:aria-label` for descriptive actions in data tables.
