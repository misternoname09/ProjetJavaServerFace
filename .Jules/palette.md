# Palette's Journal - UX & Accessibility Learnings

## 2026-10-31 - PrimeFaces Data Table and JS Confirmation UX
**Learning:** In JSF/PrimeFaces tables, using unescaped French apostrophes in inline `onclick="confirm('...')"` causes JavaScript syntax errors that break user confirmation prompts. Additionally, mismatching table iteration variables (`var="e"` with column references like `#{et.id}`) silently fails to render data and action bindings.
**Action:** Use French phrasing without apostrophes (such as `cet étudiant` instead of `l'étudiant`) in inline JS confirmation handlers to eliminate syntax breakages, ensure iteration variable names match column expressions, and provide descriptive `title` attributes on action buttons/links for tooltip and screen reader support.
