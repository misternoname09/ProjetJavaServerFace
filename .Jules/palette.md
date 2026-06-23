## 2026-06-23 - Improving Legacy JSF/PrimeFaces Forms
**Learning:** Legacy JSF applications often suffer from non-standard HTML (like typoed tags or nested forms) and lack accessibility features. Using `p:panelGrid` with `p:message` provides a clean, validated UI, while `a:aria-label` bridges the gap for icon or text-link actions in data tables.
**Action:** Always check for nested `<h:form>` tags which break JSF lifecycle, and ensure `id`/`for` mapping for all inputs and labels.
