## 2026-09-30 - Form Accessibility & Navigation in JSF Forms
**Learning:** Linking `<p:outputLabel>` components to `<p:inputText>`/`<p:calendar>` via `for` and `id` attributes ensures input labels are properly announced by screen readers. Furthermore, providing an "Annuler" button with `immediate="true"` allows users to exit forms safely without triggering JSF field validation.
**Action:** Always link labels to inputs explicitly and provide `immediate="true"` cancel navigation on JSF forms.
