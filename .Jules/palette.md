## 2025-05-14 - JSF structural and accessibility improvements
**Learning:** Legacy JSF/PrimeFaces applications often suffer from broken HTML structure (like nested or malformed form tags) and lack of accessibility attributes (like aria-labels and for/id associations). Using 'p:message' and 'p:commandButton' with icons significantly improves the feedback loop and visual affordance.
**Action:** Always check for nested forms and invalid tag syntax (like h.form vs h:form) in legacy XHTML files. Ensure labels are explicitly linked to inputs and icon-only actions have descriptive aria-labels.
