## 2025-05-15 - [JSF/PrimeFaces Accessibility and Form Layout]
**Learning:** JSF/PrimeFaces applications benefit significantly from a structured 3-column layout using `p:panelGrid` to align labels, inputs, and `p:message` feedback. Additionally, JSF EL is case-sensitive, and property references in `p:dataTable` must strictly match the `var` attribute.
**Action:** Always use `p:panelGrid columns="3"`, ensure `for` attributes match input `id`s for accessibility, and use `a:aria-label` for action links in tables.
