## 2025-05-15 - Form accessibility and interaction fixes in JSF
**Learning:** Legacy JSF applications often have subtle bugs like invalid tag syntax (e.g., `<h.form>` instead of `<h:form>`), case-sensitive method references, and broken EL property names that aren't immediately obvious without deep inspection. Accessibility is also frequently overlooked in these projects.
**Action:** Always verify the correct JSF/PrimeFaces tag syntax and match EL expressions exactly with Java entity property names and bean method casing.
