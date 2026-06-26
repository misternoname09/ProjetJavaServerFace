## 2026-06-26 - Legacy JSF UI Improvement Discovery
**Learning:** Legacy JSF/PrimeFaces applications often contain structural issues like nested forms (which are invalid and break the JSF lifecycle), case-sensitivity bugs in EL method expressions, and accessibility gaps such as missing associations between labels and inputs.
**Action:** Always verify form nesting, check case-sensitivity of bean method calls against Java source, and ensure `p:outputLabel` is correctly linked to inputs via `for`/`id` attributes.
