## 2026-08-21 - JSF Form Accessibility and Cancel Action
**Learning:** In JSF/PrimeFaces forms, omitting `for` attributes on `p:outputLabel` prevents assistive technology from connecting labels to input fields. Additionally, missing secondary cancel actions force users to complete validation or reload the page to abandon form entry.
**Action:** Always pair `p:outputLabel` with explicit `for` and `id` on form inputs, and provide an `immediate="true"` cancel button on separate creation views to bypass validation and improve keyboard/screen reader navigation flow.
