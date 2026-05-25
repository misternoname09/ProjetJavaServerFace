## 2025-05-22 - [JSF Component and Accessibility Patterns]
**Learning:** PrimeFaces components like `p:inputText` and `p:calendar` need explicit `id` attributes linked to `p:outputLabel` via `for` for accessibility. Also, JSF EL method references are case-sensitive and must match the Java source exactly, even if they deviate from camelCase conventions (e.g., `AddEtudiant`).
**Action:** Check Java method signatures when fixing XHTML actions and ensure every form input has a paired label with proper `id`/`for` attributes.
