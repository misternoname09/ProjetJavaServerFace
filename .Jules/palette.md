## 2026-07-16 - Handling functional bugs as UX blockers in legacy JSF projects
**Learning:** In legacy JSF/PrimeFaces projects, "UX improvements" often require first fixing deep-seated functional bugs like variable binding mismatches (e.g., 'e' vs 'et') and property name inconsistencies (e.g., 'dateNais' vs 'datenaiss') that render UI data invisible. Additionally, nested forms must be avoided as they break the JSF lifecycle.
**Action:** Always audit variable bindings and form hierarchy before applying accessibility or polish enhancements in legacy environments. Use 'sed' surgically to handle CRLF endings without exceeding PR line limits.

## 2026-07-16 - Accessible forms with PrimeFaces panelGrid
**Learning:** Using 'h:panelGrid columns="3"' in PrimeFaces provides a clean layout for label, input, and validation message. Explicitly linking labels to inputs using the 'for' attribute is essential for screen reader accessibility and enables 'p:message' to correctly target the field.
**Action:** Standardize form structures with 'panelGrid' and 'p:message' to provide immediate, accessible feedback.
