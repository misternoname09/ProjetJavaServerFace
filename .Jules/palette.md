## 2024-05-23 - Accessibility in JSF/PrimeFaces
**Learning:** JSF/PrimeFaces components require explicit `id` and `for` association for `p:outputLabel` to be accessible. Nested `h:form` or dot-separated tags (like `h.form`) are invalid and break the JSF lifecycle.
**Action:** Always check for `id`/`for` pairs in JSF forms and ensure correct tag syntax.
