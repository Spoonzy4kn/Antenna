# Antenna

**Status:** Pre-Alpha / Android skeleton started
**Platform:** Android  
**Primary technology direction:** Kotlin, Jetpack Compose, Gradle  
**Version 1 compatibility target:** Reddit  
**Repository:** `Spoonzy4kn/Antenna`

Antenna is an open-source Android application for browsing community-driven discussion platforms through a clean, efficient, responsive, practical, intuitive, and transparent user experience.

Version 1 is scoped as a focused Android client compatible with Reddit. The project is intentionally not trying to reproduce every feature of Reddit or every feature of existing third-party clients. Its purpose is to establish a stable, maintainable, privacy-conscious foundation that can support community browsing, post reading, comment reading, local favourites, basic search, and simple settings without unnecessary complexity.

Antenna has moved from documentation-only planning into the first Android skeleton. The current app code is intentionally minimal: it establishes the native Android project, Compose setup, application ID, basic theme, primary navigation shell, and placeholder screens.

---

## Core principles

Antenna is guided by the following principles:

- **Simple:** avoid unnecessary complexity.
- **Efficient:** minimise resource usage, startup time, memory usage, battery consumption, and network overhead.
- **Responsive:** keep the interface smooth and provide immediate feedback.
- **Practical:** build features that solve real user problems.
- **Intuitive:** make navigation and behaviour predictable.
- **Transparent:** clearly explain data use, permissions, platform limitations, and account requirements.
- **Maintainable:** keep the code modular, readable, documented, and testable.
- **Consistent:** use the same terminology, patterns, and behaviours throughout the app.

---

## Version 1 scope

Version 1 is the foundation release. It should deliver a usable Android browsing experience without attempting to become a full Reddit replacement.

Version 1 shall include:

- Native Android application foundation.
- Clean user interface.
- Home feed based on local favourites where supported.
- Community browsing.
- Post feed viewing.
- Post detail viewing.
- Comment viewing with nested comment support.
- Local favourites, named **My Subs** in the UI.
- Basic search where supported by the connected platform.
- Local settings.
- Theme mode, including dark mode.
- NSFW visibility setting where permitted.
- Clear loading, empty, error, restricted, and unsupported states.
- No application-owned advertising.
- No telemetry or analytics by default.
- Documentation sufficient for users, contributors, and maintainers.

Version 1 does not include iOS, desktop, web, cloud sync, a multi-provider plugin system, AI features, full account management, moderation tooling, in-app purchases, application-owned advertising, or telemetry/analytics by default.

---

## Primary navigation

Antenna's main navigation is:

```text
Home
Search
Explore
My Subs
Settings
```

Secondary settings sections are:

```text
Appearance
Content
Privacy
Account
FAQ
About
```

---

## Documentation map

The professional documentation set is organised as follows:

| Document | Purpose |
| --- | --- |
| [`docs/00_documentation_index.md`](docs/00_documentation_index.md) | Documentation map, ownership, and maintenance rules. |
| [`docs/01_vision.md`](docs/01_vision.md) | Product vision, mission, objectives, and success criteria. |
| [`docs/02_project_principles.md`](docs/02_project_principles.md) | Engineering and product principles used to evaluate decisions. |
| [`docs/03_scope_of_works.md`](docs/03_scope_of_works.md) | Version 1 scope, exclusions, deliverables, and change control. |
| [`docs/04_functional_requirements.md`](docs/04_functional_requirements.md) | Numbered functional requirements from a user-facing perspective. |
| [`docs/05_non_functional_requirements.md`](docs/05_non_functional_requirements.md) | Performance, reliability, privacy, security, accessibility, maintainability, and quality requirements. |
| [`docs/06_decision_log.md`](docs/06_decision_log.md) | Architecture and product decision records. |
| [`docs/07_ui_ux_specification.md`](docs/07_ui_ux_specification.md) | Navigation, screen behaviour, content states, and UI rules. |
| [`docs/08_architecture.md`](docs/08_architecture.md) | Proposed modular Android architecture, data flow, boundaries, and constraints. |
| [`docs/09_product_requirements_document.md`](docs/09_product_requirements_document.md) | Professional PRD consolidating product goals, personas, use cases, and release objectives. |
| [`docs/10_user_stories_and_journeys.md`](docs/10_user_stories_and_journeys.md) | User stories, acceptance criteria, and end-to-end journeys. |
| [`docs/11_data_privacy_security.md`](docs/11_data_privacy_security.md) | Local data model, privacy posture, permissions, storage, and security rules. |
| [`docs/12_accessibility_requirements.md`](docs/12_accessibility_requirements.md) | Accessibility expectations for Android implementation. |
| [`docs/13_testing_strategy.md`](docs/13_testing_strategy.md) | Test strategy, coverage areas, manual test scripts, and release validation. |
| [`docs/14_release_and_versioning.md`](docs/14_release_and_versioning.md) | Versioning, release states, changelog rules, and release checklist. |
| [`docs/15_reddit_compatibility_and_policy.md`](docs/15_reddit_compatibility_and_policy.md) | Reddit compatibility boundaries and policy-safe implementation guidance. |
| [`docs/16_open_questions_risks_assumptions.md`](docs/16_open_questions_risks_assumptions.md) | Open questions, risks, assumptions, and mitigation plans. |
| [`docs/17_requirements_traceability_matrix.md`](docs/17_requirements_traceability_matrix.md) | Traceability from principles to scope, requirements, UI, architecture, and tests. |
| [`docs/18_roadmap.md`](docs/18_roadmap.md) | Milestones from documentation phase through Version 1 foundation. |
| [`docs/19_glossary.md`](docs/19_glossary.md) | Shared terminology for users, developers, and contributors. |
| [`docs/20_implementation_backlog.md`](docs/20_implementation_backlog.md) | Epics and implementation tasks for the first development phase. |
| [`docs/21_documentation_audit.md`](docs/21_documentation_audit.md) | Notes on what was expanded, created, reorganised, and standardised. |

Repository-level supporting documents:

| Document | Purpose |
| --- | --- |
| [`CONTRIBUTING.md`](CONTRIBUTING.md) | Contribution process and documentation standards. |
| [`SECURITY.md`](SECURITY.md) | Security reporting and privacy-sensitive development guidance. |
| [`CHANGELOG.md`](CHANGELOG.md) | Changelog template. |
| [`CODE_OF_CONDUCT.md`](CODE_OF_CONDUCT.md) | Contributor behaviour expectations. |
| [`LICENSE_NOTICE.md`](LICENSE_NOTICE.md) | License placeholder until a final project license is selected. |

---

## Proposed repository structure

```text
Antenna/
|-- README.md
|-- CHANGELOG.md
|-- CODE_OF_CONDUCT.md
|-- CONTRIBUTING.md
|-- LICENSE_NOTICE.md
|-- SECURITY.md
|-- docs/
|   |-- 00_documentation_index.md
|   |-- 01_vision.md
|   |-- 02_project_principles.md
|   |-- 03_scope_of_works.md
|   |-- 04_functional_requirements.md
|   |-- 05_non_functional_requirements.md
|   |-- 06_decision_log.md
|   |-- 07_ui_ux_specification.md
|   |-- 08_architecture.md
|   |-- 09_product_requirements_document.md
|   |-- 10_user_stories_and_journeys.md
|   |-- 11_data_privacy_security.md
|   |-- 12_accessibility_requirements.md
|   |-- 13_testing_strategy.md
|   |-- 14_release_and_versioning.md
|   |-- 15_reddit_compatibility_and_policy.md
|   |-- 16_open_questions_risks_assumptions.md
|   |-- 17_requirements_traceability_matrix.md
|   |-- 18_roadmap.md
|   |-- 19_glossary.md
|   |-- 20_implementation_backlog.md
|   |-- 21_documentation_audit.md
|   |-- adr/
|   |   `-- ADR-000-template.md
|   `-- templates/
|       |-- feature_spec_template.md
|       `-- release_checklist_template.md
`-- app / core-* / feature-* modules once implementation begins
```

---

## Implementation status

Application code is now present under `app/`.

Current implementation baseline:

- Single Android application module: `app`.
- Kotlin and Jetpack Compose configured through Gradle Kotlin DSL.
- Application ID: `dev.spoonzy4kn.antenna`.
- Minimum SDK: 26.
- Compile and target SDK: 35.
- Primary navigation shell: Home, Search, Explore, My Subs, Settings.
- Placeholder screens for each primary destination.
- Initial smoke unit test path.

Build notes:

- Use Android Studio with JDK 17 support.
- Install Android SDK 35.
- Open the repository root in Android Studio and allow Gradle sync to download dependencies.
- Command-line build, once JDK 17 and Android SDK 35 are installed:

```powershell
.\gradlew.bat assembleDebug
```

- Command-line unit test, once JDK 17 and Android SDK 35 are installed:

```powershell
.\gradlew.bat testDebugUnitTest
```

---

## Independent project disclaimer

Antenna is an independent open-source project. It is not affiliated with, endorsed by, or sponsored by Reddit. Reddit compatibility means that Version 1 is designed to interact with Reddit-supported content access methods where permitted; it does not imply official association.

---

## License

The license is currently undecided. Before public release, select a license and replace `LICENSE_NOTICE.md` with a full `LICENSE` file.
