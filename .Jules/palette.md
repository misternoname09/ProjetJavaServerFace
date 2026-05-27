## 2025-05-15 - Fixing JSF form and dataTable UX
**Learning:** Legacy JSF applications often contain invalid syntax like dot separators in tags (e.g., `<h.form>`) or nested forms which break the JSF lifecycle. Additionally, accessibility in these apps is often overlooked, specifically the connection between labels and inputs.
**Action:** Always check for tag syntax, ensure forms are not nested, and verify that `p:outputLabel` correctly uses the `for` attribute to point to the input's `id`.
